package com.ymm.cargo.core.biz.dao;

import com.ymm.cargo.core.biz.dao.po.CustomerDO;

public interface CustomerDOMapper {
    int deleteByPrimaryKey(String id);

    int insert(CustomerDO record);

    int insertSelective(CustomerDO record);

    CustomerDO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CustomerDO record);

    int updateByPrimaryKey(CustomerDO record);
}