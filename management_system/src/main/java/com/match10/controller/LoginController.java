package com.match10.controller;

import com.match10.entity.Result;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zhangchao
 * @date ：Created in 2020/5/14
 * @description ：登录校验。设置了权限校验
 * @version: 1.0
 */
@RestController
@RequestMapping("/user")
public class LoginController {

    //登录成功
    @RequestMapping("/loginSuccess")
    public Result loginSuccess(){
        return new Result(true, "登录成功");
    }

    //登陆失败
    @RequestMapping("/loginFail")
    public Result loginFail(){
        return new Result(false,"登陆失败");
    }

}
