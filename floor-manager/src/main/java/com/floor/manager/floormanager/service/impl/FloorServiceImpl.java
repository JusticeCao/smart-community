package com.floor.manager.floormanager.service.impl;

import com.floor.manager.floormanager.domain.dto.BusinessCommunityDto;
import com.floor.manager.floormanager.domain.entity.BusinessCommunity;
import com.floor.manager.floormanager.mapper.BusinessCommunityMapper;
import com.floor.manager.floormanager.service.FloorService;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class FloorServiceImpl implements FloorService {
    @Resource
    BusinessCommunityMapper businessCommunityMapper;

    @Override
    public List<BusinessCommunity> findPage(int page, int size) {

        return PageHelper.startPage(page,size);
    }

    @Override
    public BusinessCommunity add(BusinessCommunityDto businessCommunityDto) {
         BusinessCommunity businessCommunity = new BusinessCommunity();
        BeanUtils.copyProperties(businessCommunityDto,businessCommunity);
         int insert = businessCommunityMapper.insert(businessCommunity);
        return businessCommunity;
    }

    @Override
    public BusinessCommunity update(int cid, BusinessCommunityDto businessBuildingRoomDto) {
        return null;
    }
}
