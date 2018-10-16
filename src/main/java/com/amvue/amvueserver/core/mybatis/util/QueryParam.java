package com.amvue.amvueserver.core.mybatis.util;

import java.util.ArrayList;
import java.util.List;

public class QueryParam {
    private Integer page;
    private Integer pageSize;

    private List<QueryFilter> queryFilters = new ArrayList<>();

    public List<QueryFilter> getQueryFilters() {
        return queryFilters;
    }

    public void setQueryFilters(List<QueryFilter> queryFilters) {
        this.queryFilters = queryFilters;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
