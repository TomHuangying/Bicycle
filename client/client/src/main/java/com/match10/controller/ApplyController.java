package com.match10.controller;

import com.match10.pojo.Applys;
import com.match10.pojo.Users;
import com.match10.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ApplyController {
    @Autowired
    private ApplyService applyService;

    @RequestMapping("/sign_up")
    public String addUser(Map<String,Object> map, Applys applys){
        map.put("msg","报名成功！！！请在我的参赛情况进行查看");
        applyService.insertRace(applys);

        return "login_index.html";
    }
}
