package com.amvue.amvueserver.core.basic;

import java.util.List;

public interface BasicMapper<T extends BasicModel> {

    T queryOne(T t);

    List<T> queryAll(T t);

    List<T> queryPage(T t);

    Integer queryCount(T t);

    Integer insert(T t);

    Integer update(T t);

    Integer delete(T t);

}
