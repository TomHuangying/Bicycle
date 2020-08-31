package com.match10.service;

import com.match10.mapper.RaceMapper;
import com.match10.pojo.Races;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RaceService {

    @Autowired
    private RaceMapper raceMapper;

    public List<Races> selectRacesAll(){
        return raceMapper.selectRacesAll();
    }
}
