package com.amvue.amvueserver.business.acct;

import com.amvue.amvueserver.core.basic.BasicMapper;
import com.amvue.amvueserver.core.basic.BasicServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AcctServiceImpl extends BasicServiceImpl<Acct> implements AcctService {

    @Resource
    private AcctMapper acctMapper;


    @Override
    public BasicMapper<Acct> basicMapper() throws Exception {
        return acctMapper;
    }
}
