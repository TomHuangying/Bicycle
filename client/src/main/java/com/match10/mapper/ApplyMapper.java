package com.match10.mapper;

import com.match10.pojo.Applys;
import com.match10.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ApplyMapper {

    //插入比赛，用户id
    void insertRace(Applys applys);
    //取消比赛
    void delRace(Applys applys);
    //  查看比赛信息
    List selRace(Applys applys);
}
