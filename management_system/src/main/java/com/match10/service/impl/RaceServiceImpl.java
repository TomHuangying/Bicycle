package com.match10.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.match10.dao.RaceDao;
import com.match10.entity.PageResult;
import com.match10.pojo.Race;
import com.match10.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：zhangchao
 * @description ：
 * @version: 1.0
 */
@Service
@Transactional
public class RaceServiceImpl implements RaceService {

    @Autowired
    private RaceDao raceDao;

    //分页查询
    @Override
    public PageResult findPageByCondition(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage, pageSize);
        Page<Race> pageList = raceDao.findPageByCondition(queryString);
        return new PageResult(pageList.getTotal(), pageList.getResult());
    }

    //添加比赛
    @Override
    public void addRace(Race race) {
        raceDao.addRace(race);
    }

    //根据id删除比赛
    @Override
    public void deleteRaceById(Integer id) {
        raceDao.deleteRaceById(id);
    }

    //根据id查询比赛信息
    @Override
    public Race findRaceById(Integer id) {
        return raceDao.findRaceById(id);
    }

    @Override
    public void editRace(Race race) {
        raceDao.editRace(race);
    }
}
