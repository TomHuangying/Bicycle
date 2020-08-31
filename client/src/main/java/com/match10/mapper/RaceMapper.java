package com.match10.mapper;

import com.match10.pojo.Races;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RaceMapper {
    //查询所有
    List<Races> selectRacesAll();
}

