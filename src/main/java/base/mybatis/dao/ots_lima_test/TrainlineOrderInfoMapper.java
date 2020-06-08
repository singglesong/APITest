package base.mybatis.dao.ots_lima_test;

import base.mybatis.model.ots_lima_test.TrainlineOrderInfo;

public interface TrainlineOrderInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(TrainlineOrderInfo record);

    int insertSelective(TrainlineOrderInfo record);

    TrainlineOrderInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TrainlineOrderInfo record);

    int updateByPrimaryKey(TrainlineOrderInfo record);
}