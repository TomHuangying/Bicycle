package com.match10.service;

import com.match10.mapper.ApplyMapper;
import com.match10.pojo.Applys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplyService {
    @Autowired
    private ApplyMapper applyMapper;

    public void insertRace(Applys applys){
        applyMapper.insertRace(applys);
    }
}
