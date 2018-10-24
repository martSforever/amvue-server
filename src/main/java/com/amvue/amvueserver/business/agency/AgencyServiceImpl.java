package com.amvue.amvueserver.business.agency;

import com.amvue.amvueserver.core.basic.BasicMapper;
import com.amvue.amvueserver.core.basic.BasicServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AgencyServiceImpl extends BasicServiceImpl<Agency> implements AgencyService {

    @Resource
    private AgencyMapper agencyMapper;

    @Override
    public BasicMapper<Agency> basicMapper() throws Exception {
        return agencyMapper;
    }
}
