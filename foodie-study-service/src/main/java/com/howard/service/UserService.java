package com.howard.service;

import com.howard.bo.UserBO;
import com.howard.pojo.Users;

public interface UserService {

    /**
    *判断用户名是否存在
    */
    public boolean queryUsernameIsExist(String username);

    /**
     *用户注册
     */
    public Users creatUser(UserBO userBO);

    /**
     *登录验证
     */
    public Users queryUserForLogin(String username,String password);
}
