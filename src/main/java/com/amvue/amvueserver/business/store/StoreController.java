package com.amvue.amvueserver.business.store;

import com.amvue.amvueserver.core.basic.BasicController;
import com.amvue.amvueserver.core.basic.BasicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("store")
public class StoreController extends BasicController<Store> {

    @Resource
    private StoreService storeService;

    @Override
    public BasicService<Store> getBasicService() throws Exception {
        return storeService;
    }
}
