package org.fffd.l23o6.service.impl;


import lombok.RequiredArgsConstructor;
import org.fffd.l23o6.dao.TrainDao;
import org.fffd.l23o6.pojo.vo.train.AdminTrainVO;
import org.fffd.l23o6.pojo.vo.train.TrainDetailVO;
import org.fffd.l23o6.pojo.vo.train.TrainVO;
import org.fffd.l23o6.service.TrainService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

// TODO: 2023/5/26
// add interface and implement it
@Service
@RequiredArgsConstructor
public class TrainServiceImpl implements TrainService {
    private final TrainDao trainDao;

    public TrainDetailVO getTrain(Long trainId){
        return
    }
    public List<TrainVO> listTrains(Long startStationId, Long endStationId, String date){

    }
    public List<AdminTrainVO> listTrainsAdmin(){

    }
    public void addTrain(String name, Long routeId, String type, String date, List<Date> arrivalTimes, List<Date> departureTimes){

    }
}
