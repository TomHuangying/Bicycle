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
	Users login(String username);

	//查询id
    Users selId(String username);

    //查看是否用户重复


//  查看比赛信息
    List selRace(Users users);

	//查询所有
//	List<Users> selectUsersAll();

//	List<Users> sel();
}
