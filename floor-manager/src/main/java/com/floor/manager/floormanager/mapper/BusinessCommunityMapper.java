package com.floor.manager.floormanager.mapper;

import com.floor.manager.floormanager.domain.entity.BusinessCommunity;

public interface BusinessCommunityMapper {
    int deleteByPrimaryKey(Integer communityId);

    int insert(BusinessCommunity record);

    int insertSelective(BusinessCommunity record);

    BusinessCommunity selectByPrimaryKey(Integer communityId);

    int updateByPrimaryKeySelective(BusinessCommunity record);

    int updateByPrimaryKey(BusinessCommunity record);
}