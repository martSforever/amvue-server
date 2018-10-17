package com.amvue.amvueserver.business.acct;

import java.util.List;

public interface AcctService {
    Acct queryOne(Acct acct);

    List<Acct> queryAll(Acct acct);

    List<Acct> queryPage(Acct acct);

    Integer queryCount(Acct acct);

    Integer insert(Acct acct);

    Integer multiInsert(List<Acct> accts);

    Integer update(Acct acct);

    Integer multiUpdate(List<Acct> accts);

    Integer delete(Acct acct);

    Integer multiDelete(List<Acct> accts);
}
