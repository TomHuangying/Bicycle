package com.match10.service;


import com.match10.mapper.UsersMapper;
import com.match10.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UsersMapper usersMapper;

//    public List<Users> sel(){
//        List sel = usersMapper.sel();
//        return sel;
//    }

    public void insertUser(Users users){
        usersMapper.insertUser(users);
    }

    public Users login(String username,String password){
        Users users = new Users();
        users.setUsername(username);
        users.setPassword(password);
        if(users!= null){
            return usersMapper.login(users);
        }
        return null;
    }

    public Users selId(Users users){
        return usersMapper.selId(users);
    }

    public boolean userRepet(String username){
        Users byUsername = usersMapper.userRepet(username);
        return byUsername==null;//为空是不存在
    }
}
