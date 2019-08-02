package coms.backstage.test.web;

import coms.backstage.test.dao.Testuser;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin(value="*")
@RequestMapping("/emp")
public class testController {
    @Resource
    private Testuser te;

    @ResponseBody
    @RequestMapping("/logs")
    public List<Map<String,Object>> ems(Map<String,Object> map){
        List<Map<String, Object>> kill = te.testselectuser();
        return kill;
    };
}
