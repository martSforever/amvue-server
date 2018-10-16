package com.amvue.amvueserver.business.acct;


import com.amvue.amvueserver.core.mybatis.util.QueryParam;

public class Acct {

    private int id;
    private String acctName;
    private String acctCode;
    private String birthday;
    private String acctType;
    private String acctAge;
    private String acctAgencyId;

    private String acctAgency;

    private QueryParam queryParam = new QueryParam();

    public QueryParam getQueryParam() {
        return queryParam;
    }

    public String getAcctAge() {
        return acctAge;
    }

    public void setAcctAge(String acctAge) {
        this.acctAge = acctAge;
    }

    public void setQueryParam(QueryParam queryParam) {
        this.queryParam = queryParam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcctAgencyId() {
        return acctAgencyId;
    }

    public void setAcctAgencyId(String acctAgencyId) {
        this.acctAgencyId = acctAgencyId;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getAcctCode() {
        return acctCode;
    }

    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public String getAcctAgency() {
        return acctAgency;
    }

    public void setAcctAgency(String acctAgency) {
        this.acctAgency = acctAgency;
    }
}
