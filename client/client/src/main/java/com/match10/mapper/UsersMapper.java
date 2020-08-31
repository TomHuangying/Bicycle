package com.match10.mapper;

import com.match10.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UsersMapper {

	//注册
    void insertUser(Users users);

    //登录
	Users login(Users users);

	//查询id
    Users selId(Users users);

    //查看是否用户重复
    Users userRepet(String username);
	//查询所有
//	List<Users> selectUsersAll();

//	List<Users> sel();
}
