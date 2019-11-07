package com.floor.manager.floormanager.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class BusinessCommunityAttr {
    /**
    * 订单ID
    */
    private String bId;

    /**
    * 属性id
    */
    private String attrId;

    /**
    * 用户ID
    */
    private String communityId;

    /**
    * 规格id,参考spec表
    */
    private String specCd;

    /**
    * 属性值
    */
    private String value;

    /**
    * 月份
    */
    private Integer month;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 数据状态，添加ADD，修改MOD 删除DEL
    */
    private String operate;
}