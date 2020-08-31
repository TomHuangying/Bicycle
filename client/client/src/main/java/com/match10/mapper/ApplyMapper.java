package com.match10.mapper;

import com.match10.pojo.Applys;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ApplyMapper {

    //插入比赛，用户id
    void insertRace(Applys applys);
}
