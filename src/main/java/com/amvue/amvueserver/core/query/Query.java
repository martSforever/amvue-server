package com.amvue.amvueserver.core.query;

import java.util.ArrayList;
import java.util.List;

public class Query {
    private Integer page;
    private Integer pageSize;

    private List<Filter> filters = new ArrayList<>();

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
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
