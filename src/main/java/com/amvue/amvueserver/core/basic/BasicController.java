package com.amvue.amvueserver.core.basic;

import com.amvue.amvueserver.core.ControllerUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public class BasicController<T extends BasicModel> {

    public BasicService<T> getBasicService() throws Exception {
        throw new Exception("获取Basic Service 失败，请确认程序代码是否正确！");
    }

    @PostMapping("queryOne")
    public Map<String, Object> queryOne(@RequestBody T t) {
        try {
            return ControllerUtils.success(getBasicService().queryOne(t));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }

    @PostMapping("queryPage")
    public Map<String, Object> queryPage(@RequestBody T t) {
        try {
            return ControllerUtils.success(getBasicService().queryPage(t));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }

    @PostMapping("queryAll")
    public Map<String, Object> queryAll(@RequestBody T t) {
        try {
            return ControllerUtils.success(getBasicService().queryAll(t));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }

    @PostMapping("queryCount")
    public Map<String, Object> queryCount(@RequestBody T t) {
        try {
            return ControllerUtils.success(getBasicService().queryCount(t));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }

    @PostMapping("insert")
    public Map<String, Object> insert(@RequestBody T t) {
        try {
            return ControllerUtils.success(getBasicService().insert(t));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }

    @PostMapping("multiInsert")
    public Map<String, Object> multiInsert(@RequestBody List<T> t) {
        try {
            return ControllerUtils.success(getBasicService().multiInsert(t));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }

    @PostMapping("update")
    public Map<String, Object> update(@RequestBody T t) {
        try {
            return ControllerUtils.success(getBasicService().update(t));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }


    @PostMapping("multiUpdate")
    public Map<String, Object> multiUpdate(@RequestBody List<T> t) {
        try {
            return ControllerUtils.success(getBasicService().multiUpdate(t));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }


    @PostMapping("delete")
    public Map<String, Object> delete(@RequestBody T t) {
        try {
            return ControllerUtils.success(getBasicService().delete(t));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }

    @PostMapping("multiDelete")
    public Map<String, Object> multiDelete(@RequestBody List<T> t) {
        try {
            return ControllerUtils.success(getBasicService().multiDelete(t));
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtils.error(e);
        }
    }
}
