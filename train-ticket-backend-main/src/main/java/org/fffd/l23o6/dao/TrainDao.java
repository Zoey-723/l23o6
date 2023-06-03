package org.fffd.l23o6.dao;

import org.fffd.l23o6.pojo.entity.TrainEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainDao extends JpaRepository<TrainEntity, Long>{
    // TODO: 2023/5/26
    TrainEntity findTrainById(Long trainId);

    TrainEntity findTrainByName(String name);


}
