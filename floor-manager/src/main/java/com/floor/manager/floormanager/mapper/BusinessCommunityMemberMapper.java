package com.floor.manager.floormanager.mapper;

import com.floor.manager.floormanager.domain.entity.BusinessCommunityMember;

public interface BusinessCommunityMemberMapper {
    int insert(BusinessCommunityMember record);

    int insertSelective(BusinessCommunityMember record);
}