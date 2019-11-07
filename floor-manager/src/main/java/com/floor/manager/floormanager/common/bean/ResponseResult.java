package com.floor.manager.floormanager.common.bean;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseResult <T> {
    private int status;
    private String msg;
    private T data;

    public static <T> ResponseResult success(T data){
        return ResponseResult.builder()
                .status(ResultStatus.SUCCESS.getStatus())
                .msg(ResultStatus.SUCCESS.getMsg()).data(data).build();
    }

    public static <T> ResponseResult error(){
        return ResponseResult.builder()
                .status(ResultStatus.ERROR.getStatus())
                .msg(ResultStatus.ERROR.getMsg()).build();
    }

    public static <T> ResponseResult error(ResultStatus resultStatus){
        return ResponseResult.builder().msg(resultStatus.getMsg())
                .status(resultStatus.getStatus()).build();
    }
}
