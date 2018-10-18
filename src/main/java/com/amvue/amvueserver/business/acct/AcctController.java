package com.amvue.amvueserver.business.acct;

import com.amvue.amvueserver.core.ControllerUtils;
import com.amvue.amvueserver.core.basic.BasicController;
import com.amvue.amvueserver.core.basic.BasicService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("acct")
public class AcctController extends BasicController<Acct> {

    @Resource
    private AcctService acctService;


    @Override
    public BasicService<Acct> getBasicService() throws Exception {
        return acctService;
    }
}
