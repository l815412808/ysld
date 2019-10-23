package com.action;
import com.entity.*;
import com.service.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(allowCredentials = "true",maxAge = 3600)
@RestController
public class OrderdetailsController {
     @Autowired
     private IOrderdetailsService  orderdetailsService;
     @Autowired
     private IOrderService iorderService;
     @Autowired
     private IReceivingService  receivingService;
     @Autowired
     private IUserService userService;

     @RequestMapping(value="/showAllOrdetails",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
      public Map<String,Object> showAllOrdetails(@RequestParam Map<String,Object>mp){
         Map<String, Object> rm = new HashMap<>();
         if(mp !=null) {
             int uid=0;
             try {
                uid=Integer.valueOf(mp.get("uid").toString()) ;
             }catch (Exception e){
               uid=0;
             }
             if(uid>0){
                 User user=userService.selectByPrimaryKey(uid);
                 rm.put("user",user);
             }
             //搜寻oid 最大
             int oid = iorderService.selectMaxId();
             mp.put("oid", oid);
             //订单详情
             List<Orderdetails> odslist = orderdetailsService.selectOrdDatilses(mp);

             rm.put("oid", oid);
             rm.put("odslist", odslist);

             //获取默认地址 ， 全部地址
             mp.put("adressStatus", 1); //默认-uid , adressstatus=1--only_one
             List<Receiving> relist = receivingService.selectAddresses(mp);
             Receiving mrobj = relist.get(0);
             if (mrobj != null) {
                 rm.put("mrobj", mrobj);
             }

             //获取所有的地址 ，不包括默认地址 adressstatus=0
             mp.put("adressStatus", 0);  //改值
             List<Receiving> reNewlist = receivingService.selectAddresses(mp);
             if (reNewlist.size() > 0) {
                 rm.put("addresslist", reNewlist);
             }
         }
         return rm;
     }


}
