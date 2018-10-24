package com.amvue.amvueserver.business.agency;

import com.amvue.amvueserver.core.basic.BasicController;
import com.amvue.amvueserver.core.basic.BasicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("agency")
public class AgencyController extends BasicController<Agency> {

    @Resource
    private AgencyService agencyService;

    @Override
    public BasicService<Agency> getBasicService() throws Exception {
        return agencyService;
    }
}
