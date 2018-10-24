package com.amvue.amvueserver.base.lov;

import com.amvue.amvueserver.core.basic.BasicController;
import com.amvue.amvueserver.core.basic.BasicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("lov")
public class LovController extends BasicController<Lov> {

    @Resource
    private LovService lovService;

    @Override
    public BasicService<Lov> getBasicService() throws Exception {
        return lovService;
    }
}
