package com.match10.controller;

import com.github.pagehelper.Page;
import com.match10.entity.PageResult;
import com.match10.entity.QueryPageBean;
import com.match10.entity.Result;
import com.match10.pojo.Race;
import com.match10.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：zhangchao
 * @date ：Created in 2020/5/14
 * @description ：查询数据，分页显示
 * @version: 1.0
 */
@RestController
@RequestMapping("/raceitem")
public class RaceItemController {

    @Autowired
    private RaceService raceService;

    //分页查询
    @RequestMapping("/findPage")
    @PreAuthorize("hasAuthority('find')")//设置权限
    public PageResult findPage(@RequestBody QueryPageBean queryPageBean){
        try {
            return raceService.findPageByCondition(queryPageBean.getCurrentPage(), queryPageBean.getPageSize(), queryPageBean.getQueryString());
        }catch (Exception e){
            e.printStackTrace();
            return new PageResult(0L,null);
        }
    }

    //添加比赛信息
    @RequestMapping("/addRace")
    @PreAuthorize("hasAuthority('add')")//设置权限
    public Result addRace(@RequestBody Race race){
        try {
            raceService.addRace(race);
            return new Result(true, "添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false, "添加失败");
        }
    }

    //删除比赛信息
    @RequestMapping("/delete")
    @PreAuthorize("hasAuthority('delete')")//设置权限
    public Result deleteRace(Integer id){
        try {
            raceService.deleteRaceById(id);
            return new Result(true, "删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    //根据id查询比赛信息
    @RequestMapping("/findRaceById")
    @PreAuthorize("hasAuthority('find')")//设置权限
    public Result findRaceById(Integer id){
        try {
            Race race = raceService.findRaceById(id);
            return new Result(true, "查询成功",race);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false, "查询失败");
        }
    }

    //编辑比赛信息
    @RequestMapping("/editRace")
    @PreAuthorize("hasAuthority('update')")//设置权限
    public Result editRace(@RequestBody Race race){
        try {
            raceService.editRace(race);
            return new Result(true, "编辑成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false, "编辑失败");
        }
    }
}
