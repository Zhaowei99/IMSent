package coms.backstage.test.web;

import coms.backstage.test.dao.Testuser;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class testController {
    @Resource
    private Testuser te;

    @RequestMapping("/logs")
    public String ems(Map<String,Object> map){
        List<Map<String, Object>> kill = te.testselectuser("店长");
        System.out.println(kill.toString());
        map.put("user",kill);
        return "test";
    };
}
