package org.fffd.l23o6.mapper;

import org.fffd.l23o6.pojo.entity.TrainEntity;
import org.fffd.l23o6.pojo.vo.train.TrainVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TrainMapper {
    // Something missing here? But what is it?
    // Just take a look at its cousins.
    // TODO: 2023/5/26
    TrainMapper INSTANCE = Mappers.getMapper(TrainMapper.class);

    TrainVO toTrainVO(TrainEntity trainEntity);
}

