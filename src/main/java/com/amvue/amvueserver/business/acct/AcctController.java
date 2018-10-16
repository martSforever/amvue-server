package com.amvue.amvueserver.business.acct;

import com.amvue.amvueserver.core.ControllerUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("acct")
public class AcctController {

    @Resource
    private AcctService acctService;

    @PostMapping("queryOne")
    public Map<String, Object> queryOne(@RequestBody Acct acct) {
        try {
            return ControllerUtils.success(acctService.queryOne(acct));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }

    @PostMapping("queryPage")
    public Map<String, Object> queryPage(@RequestBody Acct acct) {
        try {
            return ControllerUtils.success(acctService.queryPage(acct));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }

    @PostMapping("queryAll")
    public Map<String, Object> queryAll(@RequestBody Acct acct) {
        try {
            return ControllerUtils.success(acctService.queryAll(acct));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }

    @PostMapping("queryCount")
    public Map<String, Object> queryCount(@RequestBody Acct acct) {
        try {
            return ControllerUtils.success(acctService.queryCount(acct));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }

    @PostMapping("insert")
    public Map<String, Object> insert(@RequestBody Acct acct) {
        try {
            return ControllerUtils.success(acctService.insert(acct));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }

    @PostMapping("update")
    public Map<String, Object> update(@RequestBody Acct acct) {
        try {
            return ControllerUtils.success(acctService.update(acct));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }

    @PostMapping("delete")
    public Map<String, Object> delete(@RequestBody Acct acct) {
        try {
            return ControllerUtils.success(acctService.delete(acct));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }

}
