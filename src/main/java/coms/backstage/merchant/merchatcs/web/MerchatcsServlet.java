package coms.backstage.merchant.merchatcs.web;

import coms.backstage.merchant.merchatcs.dao.Intermerchatcs;
import coms.bean.BisShop;
import coms.bean.QRCodeUtil;
import jdk.nashorn.internal.parser.DateParser;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.SimpleFormatter;

@Controller
@RequestMapping("/merchatcs")
@CrossOrigin(value="*")
public class MerchatcsServlet {
    @Resource
    private Intermerchatcs in;

    @RequestMapping("/select")
    @ResponseBody
    public List<Map<String,Object>> merchatcsselect(@RequestBody Map<String,Object> map){
        System.out.println(map.toString()); //查询商家表
        List<Map<String, Object>> list = in.selectmerchatcs(map);
        return list;
    };

    @RequestMapping("/selectaccount")
    @ResponseBody
    public List<Map<String,Object>> merchatcsselectaccount(){//查询店铺账号
        List<Map<String,Object>> list=in.selectaccount();
        return list;
    }

    @RequestMapping("/insert")
    @ResponseBody  //添加商家
    public int merchatinsert(@RequestParam  Map<String,Object>  map, @RequestParam("shop_image") MultipartFile image, @RequestParam("shop_detail_image") MultipartFile detail_image, HttpServletRequest req){
        //获取本项目的路径
        String realPath = req.getServletContext().getRealPath("/");
        //获取父级路径
        String parent=new File(realPath).getParent();
        //获得同级目录images用来保存图片
        parent=parent+"/images/";
        //获取image文件的名字
        String imagename=image.getOriginalFilename();
        //获取detail_image文件的名字
        String detail_imagename =detail_image.getOriginalFilename();
        //获取当前时间
        Date date=new Date();
        SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long time = date.getTime();//获取毫秒值用来当名字
        String teop=time+"0";//image 自定义名字
        String teop2= time+"9";//detail_imagename  自定义名字
        String teop3= time+"3"; //自定投
        File fi=new File(parent,teop+imagename.substring(imagename.lastIndexOf(".")));//image传送图片路径
        File fi1=new File(parent,teop2+detail_imagename.substring(detail_imagename.lastIndexOf(".")));
        //detail_imagename 传送路径图片
        Integer kill=0;
        try {
            image.transferTo(fi);//传送
            detail_image.transferTo(fi1);
           // 存放在二维码中的内容
            String text = "我是赵威";
            // 嵌入二维码的图片路径
            String imgPath =parent+teop+imagename.substring(imagename.lastIndexOf("."));
            // 生成的二维码的路径及名称
            String destPath = parent+teop3+".jpg";
            //生成二维码
            QRCodeUtil.encode(text,imgPath,destPath,true);

            String shop_id = in.selectshop_id();
            Integer shopid=Integer.valueOf(shop_id);
            shopid=shopid+1;

            map.put("shop_id",shopid);
            map.put("shop_image","/images/"+teop+imagename.substring(imagename.lastIndexOf(".")));
            map.put("shop_detail_image","/images/"+teop2+detail_imagename.substring(detail_imagename.lastIndexOf(".")));
            map.put("shop_qrcode","/images/"+teop3+".jpg");
            map.put("create_time",sim.format(date));

            kill = in.insertbisshop(map);
        }catch (Exception e) {
            e.printStackTrace();
        }
      return kill;
    };

    @RequestMapping("/selectid")
    @ResponseBody
    public Map<String,Object> selectbisshopid(String id){
        Map<String, Object> map = in.selectbisshopid(id);
        return map;
    };


    @RequestMapping("/updatebishsop")
    @ResponseBody
    public int updatebishopns(@RequestParam  Map<String,Object>  map, @RequestParam("shop_image") MultipartFile image, @RequestParam("shop_detail_image") MultipartFile detail_image, HttpServletRequest req){
        //获取本项目的路径
        String realPath = req.getServletContext().getRealPath("/");
        //获取父级路径
        String parent=new File(realPath).getParent();
        //获得同级目录images用来保存图片
        parent=parent+"/images/";
        //获取image文件的名字
        String imagename=image.getOriginalFilename();
        //获取detail_image文件的名字
        String detail_imagename =detail_image.getOriginalFilename();
        //获取当前时间
        Date date=new Date();
        SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long time = date.getTime();//获取毫秒值用来当名字
        String teop=time+"0";//image 自定义名字
        String teop2= time+"9";//detail_imagename  自定义名字

         //detail_imagename 传送路径图片
        Integer op =0;
        try {

            if(imagename==""){
                map.put("shop_image","");
            }else{
                File fi=new File(parent,teop+imagename.substring(imagename.lastIndexOf(".")));//image传送图片路径
                image.transferTo(fi);//传送
                map.put("shop_image","/images/"+teop+imagename.substring(imagename.lastIndexOf(".")));
            }
            if(detail_imagename==""){
                map.put("shop_detail_image","");
            }else{
                File fi1=new File(parent,teop2+detail_imagename.substring(detail_imagename.lastIndexOf(".")));
                detail_image.transferTo(fi1);
                map.put("shop_detail_image","/images/"+teop2+detail_imagename.substring(detail_imagename.lastIndexOf(".")));
            }
            map.put("create_time",sim.format(date));
            op= in.updatebisshop(map);

        }catch (Exception e) {
            e.printStackTrace();
        }
        return op;
    };

}
