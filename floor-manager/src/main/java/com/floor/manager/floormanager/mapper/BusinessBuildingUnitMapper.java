package com.floor.manager.floormanager.mapper;

import com.floor.manager.floormanager.domain.entity.BusinessBuildingUnit;

public interface BusinessBuildingUnitMapper {
    int insert(BusinessBuildingUnit record);

    int insertSelective(BusinessBuildingUnit record);
}