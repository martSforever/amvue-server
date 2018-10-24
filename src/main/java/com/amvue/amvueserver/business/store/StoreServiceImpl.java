package com.amvue.amvueserver.business.store;

import com.amvue.amvueserver.core.basic.BasicMapper;
import com.amvue.amvueserver.core.basic.BasicServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StoreServiceImpl extends BasicServiceImpl<Store> implements StoreService {

    @Resource
    private StoreMapper storeMapper;

    @Override
    public BasicMapper<Store> basicMapper() throws Exception {
        return storeMapper;
    }
}
