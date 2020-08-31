package com.match10.controller;

import com.match10.pojo.Applys;
import com.match10.pojo.Users;
import com.match10.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class ApplyController {
    @Autowired
    private ApplyService applyService;

    @RequestMapping("/sign_up")
    public String addUser(Map<String,Object> map, Applys applys,
                          @RequestParam("user_id") int user_id,
                          Model model){
        map.put("msg","报名成功！！！请在我的参赛情况进行查看");
        applyService.insertRace(applys);

//      获取用户比赛信息
        List<Applys> list = applyService.selRace(user_id);
        model.addAttribute("list",list);




        return "login_index.html";
    }

    @RequestMapping("/delRace")
    public String delRace(Map<String,Object> map,
                          @RequestParam("user_id") int user_id,
                          @RequestParam("race_id") int race_id,
                          Model model
                          ){

         applyService.delRace(user_id,race_id);
        map.put("msg","删除成功，请在我的参赛情况进行查看");
        List<Applys> list = applyService.selRace(user_id);
        model.addAttribute("list",list);





        return "login_index.html";
    }

}
