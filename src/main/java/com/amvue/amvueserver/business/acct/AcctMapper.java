package com.amvue.amvueserver.business.acct;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AcctMapper {

    Acct queryOne(Acct acct);

    List<Acct> queryAll(Acct acct);

    List<Acct> queryPage(Acct acct);

    Integer queryCount(Acct acct);

    Integer insert(Acct acct);

    Integer update(Acct acct);

    Integer delete(Acct acct);

}
