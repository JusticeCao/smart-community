package com.floor.manager.floormanager.common.bean;

public enum ResultStatus {
    SUCCESS(20000,"success"),
    ERROR(40000,"error");
    private int status;
    private String msg;

    ResultStatus(int status,String msg){
        this.msg=msg;
        this.status=status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
