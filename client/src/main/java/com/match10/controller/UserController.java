package com.match10.controller;

import com.match10.pojo.Users;
import com.match10.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {


    @Autowired
    private UserService userService;


//    /**
//     * 查询所有
//     * @return
//     */
//    @RequestMapping("/single")
////    @ResponseBody
//    public String sel(Model model){
//        List<Users> list = userService.sel();
//        model.addAttribute("list",list);
//        return "single.html";
//    }

    @RequestMapping("/index")
    public String index(){
        return "index.html";
    }


    /**
     * 注册
     * @param map
     * @param users
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser( Map<String,Object> map,
                           Users users){
            map.put("msg","注册成功，请先登录");
            userService.insertUser(users);
        return "index.html";
    }

    /**
     * 注册时判断用户是否存在
     * @param
     * @return
     */


//    @RequestMapping("/single")
//    public String single(){
//        return "single.html";
//    }

    @RequestMapping("/indextwo")
    public String indextwo(Map<String,Object> map){
        map.put("msg","请先登录");
        return "index.html";
    }

    @RequestMapping("/back_index")
    public  String back_index(){
        return "index.html";
    }


    /**
     * 登录
     * @param username
     * @param password
     * @param map
     * @return
     */

    @RequestMapping("/login_index")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map,
                        Model model
//                        HttpSession session
                        ){
        Users users = userService.login(username,password);
        if(users != null){
//            session.setAttribute("loginUser",username);
//            String str="欢迎你"+username;


            //这里的User是登陆时放入session的


            map.put("msg","欢迎你---"+username+"---登录成功,你的用户编码为："+userService.selId(username).getId());
//            map.put("id",userService.selId(users).getId());

//            获取用户比赛信息
            List<Users> list = userService.selRace(username);
            model.addAttribute("list",list);
            map.put("username",username);
            return "login_index.html";
        }else{
            map.put("msg","用户名或密码错误");
            return "index.html";
        }
    }

    public Users selId(String username){
        return userService.selId(username);
    }
//    @RequestMapping("/single")
//    public String selId(Model model){
//        int id = userService.selId(users).getId();
//        model.addAttribute("id",id);
//        return "single.html";
//    }
//      @ResponseBody
//    public String selectRacesAll(Model model){
//        List<Races> list = raceService.selectRacesAll();
//        model.addAttribute("list",list);
//        return "single.html";
//    }

}
