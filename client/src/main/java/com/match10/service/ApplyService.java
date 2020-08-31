package com.match10.service;

import com.match10.mapper.ApplyMapper;
import com.match10.pojo.Applys;
import com.match10.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyService {
    @Autowired
    private ApplyMapper applyMapper;

    public void insertRace(Applys applys){
        applyMapper.insertRace(applys);
    }

//    取消比赛
    public void delRace(int user_id,int race_id){
        Applys applys = new Applys();
        applys.setUser_id(user_id);
        applys.setRace_id(race_id);
        applyMapper.delRace(applys);
    }

//    查询参加的比赛
    public List selRace(int user_id){
        Applys applys = new Applys();
        applys.setUser_id(user_id);
        List sel = applyMapper.selRace(applys);
        return sel;
    }
}
