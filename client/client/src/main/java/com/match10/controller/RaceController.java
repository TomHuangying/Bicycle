package com.match10.controller;

import com.match10.pojo.Races;
import com.match10.pojo.Users;
import com.match10.service.RaceService;
import com.match10.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RaceController {

    @Autowired
    private RaceService raceService;
    @Autowired
    private UserService userService;

      @RequestMapping("/single")
//      @ResponseBody
    public String selectRacesAll(Model model){
        List<Races> list = raceService.selectRacesAll();
        model.addAttribute("list",list);
        return "single.html";
    }
}
