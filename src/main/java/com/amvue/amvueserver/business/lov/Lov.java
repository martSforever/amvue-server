package com.amvue.amvueserver.business.lov;

import com.amvue.amvueserver.core.basic.BasicModel;

public class Lov extends BasicModel {

    private String label;
    private String code;
    private String type;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
