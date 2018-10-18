package com.amvue.amvueserver.core.basic;

import java.util.List;

public interface BasicService<T extends BasicModel> {

    T queryOne(T t) throws Exception;

    List<T> queryAll(T t) throws Exception;

    List<T> queryPage(T t) throws Exception;

    Integer queryCount(T t) throws Exception;

    Integer insert(T t) throws Exception;

    Integer multiInsert(List<T> accts) throws Exception;

    Integer update(T t) throws Exception;

    Integer multiUpdate(List<T> accts) throws Exception;

    Integer delete(T t) throws Exception;

    Integer multiDelete(List<T> accts) throws Exception;

    BasicMapper<T> basicMapper() throws Exception;

}
