package com.match10.controller;

import com.match10.pojo.Races;
import com.match10.pojo.Users;
import com.match10.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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
    public String addUser( Map<String,Object> map, Users users){
        map.put("msg","注册成功，请先登录");
        userService.insertUser(users);
        return "index.html";
    }

    /**
     * 注册时判断用户是否存在
     * @param
     * @return
     */
    @RequestMapping("/isUniqueUsername")
//转换json数据  @ResponseBody
    @ResponseBody
    public String isUniqueUsername(String username){

        System.out.println(username);

        boolean byUsername = userService.userRepet(username);
        //吧byUsername转成字符串

        System.out.println(String.valueOf(byUsername));

        return String.valueOf(byUsername);
    }

//    @RequestMapping("/single")
//    public String single(){
//        return "single.html";
//    }

    @RequestMapping("/indextwo")
    public String indextwo(Map<String,Object> map){
        map.put("msg","请先登录");
        return "index.html";
    }

    @RequestMapping("back_index")
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
                        Map<String,Object> map
//                        HttpSession session
                        ){
        Users users = userService.login(username,password);
        if(users != null){
//            session.setAttribute("loginUser",username);
//            String str="欢迎你"+username;

            map.put("msg","欢迎你"+username+"登录成功,你的用户编码为："+userService.selId(users).getId());
//            map.put("id",userService.selId(users).getId());
            return "login_index.html";
        }else{
            map.put("msg","用户名或密码错误");
            return "index.html";
        }
    }

    public Users selId(Users users){
        return userService.selId(users);
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
