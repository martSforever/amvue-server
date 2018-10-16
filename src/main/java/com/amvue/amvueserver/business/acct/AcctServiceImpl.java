package com.amvue.amvueserver.business.acct;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AcctServiceImpl implements AcctService {

    @Resource
    private AcctMapper acctMapper;


    @Override
    public Acct queryOne(Acct acct) {
        return acctMapper.queryOne(acct);
    }

    @Override
    public List<Acct> queryAll(Acct acct) {
        return acctMapper.queryAll(acct);
    }

    @Override
    public List<Acct> queryPage(Acct acct) {
        return acctMapper.queryPage(acct);
    }

    @Override
    public Integer queryCount(Acct acct) {
        return acctMapper.queryCount(acct);
    }

    @Override
    public Integer insert(Acct acct) {
        return acctMapper.insert(acct);
    }

    @Override
    public Integer update(Acct acct) {
        return acctMapper.update(acct);
    }

    @Override
    public Integer delete(Acct acct) {
        return acctMapper.delete(acct);
    }
}
