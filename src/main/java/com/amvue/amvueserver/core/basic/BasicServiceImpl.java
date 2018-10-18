package com.amvue.amvueserver.core.basic;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public abstract class BasicServiceImpl<T> implements BasicService<T> {

    public T queryOne(T t) throws Exception {
        return (T) basicMapper().queryOne(t);
    }

    public List<T> queryAll(T t) throws Exception {
        return basicMapper().queryAll(t);
    }

    public List<T> queryPage(T t) throws Exception {
        return basicMapper().queryPage(t);
    }

    public Integer queryCount(T t) throws Exception {
        return basicMapper().queryCount(t);
    }

    public Integer insert(T t) throws Exception {
        return basicMapper().insert(t);
    }

    @Transactional
    public Integer multiInsert(List<T> accts) throws Exception {
        Integer count = 0;
        for (T t : accts) {
            count += basicMapper().insert(t);
        }
        return count;
    }

    public Integer update(T t) throws Exception {
        return basicMapper().update(t);
    }

    public Integer multiUpdate(List<T> accts) throws Exception {
        Integer count = 0;
        for (T t : accts) {
            count += basicMapper().update(t);
        }
        return count;
    }

    public Integer delete(T t) throws Exception {
        return basicMapper().delete(t);
    }

    public Integer multiDelete(List<T> accts) throws Exception {
        Integer count = 0;
        for (T t : accts) {
            count += basicMapper().delete(t);
        }
        return count;
    }

    public abstract BasicMapper<T> basicMapper() throws Exception;
}
