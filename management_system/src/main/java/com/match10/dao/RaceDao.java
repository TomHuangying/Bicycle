package com.match10.dao;

import com.github.pagehelper.Page;
import com.match10.pojo.Race;
import org.apache.ibatis.annotations.Param;

public interface RaceDao {

    //分页
    public Page<Race> findPageByCondition(@Param("queryString") String queryString);

    //添加比赛
    public void addRace(Race race);

    //删除比赛
    public void deleteRaceById(@Param("id") Integer id);

    //根据id查询比赛信息
    public Race findRaceById(@Param("id") Integer id);

    //编辑比赛
    public void editRace(Race race);

}
