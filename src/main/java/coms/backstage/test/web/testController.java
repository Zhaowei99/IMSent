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
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        // 指定配置文件
        try {
            File configFile = new File("D:\\idea\\idea\\IMS\\src\\main\\Resources\\mnb.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);

        }catch (Exception e){
            e.printStackTrace();
        }
        map.put("user",kill);
        return "test";
    };
}
