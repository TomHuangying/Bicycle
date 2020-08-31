package com.match10.service;


import com.match10.mapper.UsersMapper;
import com.match10.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


//    public List<Users> sel(){
//        List sel = usersMapper.sel();
//        return sel;
//    }

    public void insertUser(Users users){
        //加密
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        usersMapper.insertUser(users);
    }

    public Users login(String username,String password){

        Users users = usersMapper.login(username);
//        users.setUsername(username);
//        users.setPassword(password);

//        bCryptPasswordEncoder.matches(password,users.getPassword());
        if(users!= null && bCryptPasswordEncoder.matches(password, users.getPassword())){
//            usersMapper.login(users);
//            bCryptPasswordEncoder.matches(password,users.getPassword());
            return users;
        }
        return null;
    }

    public Users selId(String username){
        return usersMapper.selId(username);
    }


//查询所有参加的比赛
    public List<Users> selRace(String username){
        Users users = new Users();
        users.setUsername(username);
        List sel = usersMapper.selRace(users);
        return sel;
    }
}
