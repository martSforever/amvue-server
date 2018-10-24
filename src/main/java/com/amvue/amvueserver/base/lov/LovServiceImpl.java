package com.amvue.amvueserver.base.lov;

import com.amvue.amvueserver.core.basic.BasicMapper;
import com.amvue.amvueserver.core.basic.BasicServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LovServiceImpl extends BasicServiceImpl<Lov> implements LovService {

    @Resource
    LovMapper lovMapper;

    @Override
    public BasicMapper<Lov> basicMapper() throws Exception {
        return lovMapper;
    }
}
