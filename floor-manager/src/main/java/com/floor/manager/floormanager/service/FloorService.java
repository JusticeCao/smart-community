package com.floor.manager.floormanager.service;

import com.floor.manager.floormanager.domain.dto.BusinessCommunityDto;
import com.floor.manager.floormanager.domain.entity.BusinessCommunity;

import java.util.List;

public interface FloorService {
    List<BusinessCommunity>findPage(int page, int size);
    BusinessCommunity add(BusinessCommunityDto businessCommunityDto);
    BusinessCommunity update(int cid,BusinessCommunityDto businessCommunityDto);
}
