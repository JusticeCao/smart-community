package com.floor.manager.floormanager.mapper;

import com.floor.manager.floormanager.domain.entity.BusinessBuildingRoom;

public interface BusinessBuildingRoomMapper {
    int insert(BusinessBuildingRoom record);

    int insertSelective(BusinessBuildingRoom record);
}