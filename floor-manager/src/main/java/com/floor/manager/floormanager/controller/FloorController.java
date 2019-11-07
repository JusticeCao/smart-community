package com.floor.manager.floormanager.controller;

import com.floor.manager.floormanager.common.bean.ResponseResult;
import com.floor.manager.floormanager.domain.dto.BusinessCommunityDto;
import com.floor.manager.floormanager.domain.entity.BusinessCommunity;
import com.floor.manager.floormanager.service.FloorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/floor")
public class FloorController {
    @Resource
    FloorService floorService;

    public List<BusinessCommunity>list(@PathVariable int page,@PathVariable int size){
        final List<BusinessCommunity> pageList = floorService.findPage(page, size);

        return pageList;
    }

    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    public ResponseResult<BusinessCommunity>addCommunity(@RequestBody BusinessCommunityDto businessCommunityDto){
         BusinessCommunity businessCommunity = floorService.add(businessCommunityDto);
         return ResponseResult.success(businessCommunity);
    }
}
