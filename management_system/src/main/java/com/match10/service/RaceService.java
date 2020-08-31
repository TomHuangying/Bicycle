package com.match10.service;

import com.github.pagehelper.Page;
import com.match10.entity.PageResult;
import com.match10.pojo.Race;

public interface RaceService {

    //分页查询
    public PageResult findPageByCondition(Integer currentPage, Integer pageSize, String queryString);

    //功能描述:添加比赛信息
    public void addRace(Race race);

    //功能描述:删除比赛
    public void deleteRaceById(Integer id);

    //根据id查询比赛信息
    public Race findRaceById(Integer id);

    //编辑比赛
    public void editRace(Race race);

}
