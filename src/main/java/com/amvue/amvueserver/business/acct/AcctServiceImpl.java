package com.amvue.amvueserver.business.acct;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public Integer multiInsert(List<Acct> accts) {
        Integer count = 0;
        for (Acct acct : accts) {
            count += acctMapper.insert(acct);
        }
        return count;
    }

    @Override
    public Integer update(Acct acct) {
        return acctMapper.update(acct);
    }

    @Override
    public Integer multiUpdate(List<Acct> accts) {
        Integer count = 0;
        for (Acct acct : accts) {
            count += acctMapper.update(acct);
        }
        return count;
    }

    @Override
    public Integer delete(Acct acct) {
        return acctMapper.delete(acct);
    }

    @Override
    public Integer multiDelete(List<Acct> accts) {
        Integer count = 0;
        for (Acct acct : accts) {
            count += acctMapper.delete(acct);
        }
        return count;
    }
}
