package com.howard.service.impl;

import com.howard.bo.UserBO;
import com.howard.enums.Sex;
import com.howard.mapper.UsersMapper;
import com.howard.pojo.Users;
import com.howard.service.UserService;
import com.howard.utils.DateUtil;
import com.howard.utils.MD5Utils;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;

/**
 * @author: Howard
 * @date: 2021/3/23 11:05
 */


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UsersMapper usersMapper;

    @Autowired
    private Sid sid;

    public static final String USER_FACE = "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg2.100bt.com%2Fupload%2Fttq%2F20140516%2F1400245661553_middle.jpg&refer=http%3A%2F%2Fimg2.100bt.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1619077560&t=9b29eed3c5c93f6267a16280c639da8e";

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryUsernameIsExist(String username) {

        Example userExample = new Example(Users.class);
        Example.Criteria userCriteria = userExample.createCriteria();

        userCriteria.andEqualTo("username",username);

        Users result = usersMapper.selectOneByExample(userExample);

        return result == null ? false : true;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Users creatUser(UserBO userBO) {

        String userId = sid.nextShort();

        Users user = new Users();

        user.setId(userId);

        user.setUsername(userBO.getUsername());
        try {
            user.setPassword(MD5Utils.getMD5Str(userBO.getPassword()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        user.setNickname(userBO.getUsername());
        user.setFace(USER_FACE);
        user.setBirthday(DateUtil.stringToDate("1900-01-01"));
        user.setSex(Sex.secret.type);
        user.setCreatedTime(new Date());
        user.setUpdatedTime(new Date());

        usersMapper.insert(user);

        return user;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Users queryUserForLogin(String username, String password) {

        Example userExample = new Example(Users.class);
        Example.Criteria criteria = userExample.createCriteria();

        criteria.andEqualTo("username",username);
        criteria.andEqualTo("password",password);

        Users result = usersMapper.selectOneByExample(userExample);

        return result;
    }
}