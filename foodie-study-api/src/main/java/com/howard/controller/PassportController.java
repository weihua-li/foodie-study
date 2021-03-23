package com.howard.controller;

import com.howard.bo.UserBO;
import com.howard.pojo.Users;
import com.howard.service.UserService;
import com.howard.utils.JSONResult;
import com.howard.utils.MD5Utils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Howard
 * @date: 2021/3/23 14:25
 */

@RestController
@RequestMapping("passport")
public class PassportController {

    @Autowired
    private UserService userService;

    @GetMapping("/usernameIsExist")
    public JSONResult usernameIsExist(@RequestParam String username){

        //1、判断用户名不能为空
        if (StringUtils.isBlank(username)){
            return JSONResult.errorMsg("用户名不能为空");
        }

        //2、查找注册的用户名是否存在
        boolean isExist = userService.queryUsernameIsExist(username);
        if (isExist){
            return JSONResult.errorMsg("用户名已存在");
        }

        //3、请求成功，用户名不重复
        return JSONResult.ok();
    }

    @PostMapping("/regist")
    public JSONResult regist(@RequestBody UserBO userBO){

        String username = userBO.getUsername();
        String password = userBO.getPassword();
        String confirmPassword = userBO.getConfirmPassword();

        //1、判断用户名和密码不能为空
        if (StringUtils.isBlank(username) ||
                StringUtils.isBlank(password) ||
                StringUtils.isBlank(confirmPassword)){
            return JSONResult.errorMsg("用户名或密码不能为空");
        }

        //2、查找用户名是否存在
        boolean isExist = userService.queryUsernameIsExist(username);
        if (isExist){
            return JSONResult.errorMsg("用户名已经存在");
        }

        //3、密码长度不能少于6位
        if (password.length() < 6){
            return JSONResult.errorMsg("密码不能少于6位");
        }

        //4、判断两次密码是否一致
        if (!password.equals(confirmPassword)){
            return JSONResult.errorMsg("两次输入的密码必须一致");
        }

        //5、实现注册
        userService.creatUser(userBO);

        return JSONResult.ok();
    }

    @PostMapping("/login")
    public JSONResult login(@RequestBody UserBO userBO) throws Exception{

        String username = userBO.getUsername();
        String password = userBO.getPassword();

        //1、判断用户名和密码不能为空
        if (StringUtils.isBlank(username) ||
                StringUtils.isBlank(password)){
            return JSONResult.errorMsg("用户名或密码不能为空");
        }

        //5、实现登录
        Users result =  userService.queryUserForLogin(username, MD5Utils.getMD5Str(password));
        if (result == null){
            return JSONResult.errorMsg("用户名或密码错误");
        }

        return JSONResult.ok(result);
    }
}
