package com.amvue.amvueserver.core.mybatis.util;

public class Order {

    private String field;
    private Boolean desc = true;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Boolean getDesc() {
        return desc;
    }

    public void setDesc(Boolean desc) {
        this.desc = desc;
    }

}
