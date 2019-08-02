package coms.backstage.merchant.merchatcs.dao;

import java.util.List;
import java.util.Map;

public interface Intermerchatcs {
     //查询商家信息
     List<Map<String,Object>> selectmerchatcs(Map<String,Object> map);

     //查询店主账号
     List<Map<String,Object>> selectaccount();
     //查询id
     String  selectshop_id();
     //添加数据
     Integer insertbisshop(Map<String,Object> map);
     //根据id查询bis_shop表
     Map<String,Object> selectbisshopid(String id);

     //修改商家表
     Integer updatebisshop(Map<String,Object> map);

}
