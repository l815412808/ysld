package com.action;
import com.entity.*;
import com.service.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(allowCredentials = "true",maxAge = 3600)
@RestController
public class OrderController {
    @Autowired
    private IOrderService  iorderser;
    @Autowired
    private IOrderdetailsService orderdetailsService;

    @RequestMapping(value="/insertOrder/{uid}/{total}",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Integer insertOrder(@PathVariable(value="uid")Integer uid,@PathVariable(value="total")Double total,@RequestParam(value="number")List<Integer> numlist,@RequestParam(value="pid")List<Integer> pidlist) throws Exception {
        System.out.println("uid="+uid+"--total="+total);
        System.out.println("numlist="+numlist);
        System.out.println("pidlist="+pidlist);
        Integer ordNum=createOrder(uid,total,numlist);
        //在创建订单orderDetails--表
        if(ordNum>0){
           Integer ordtailsNum=createOrderDetails(numlist,pidlist);
           return ordtailsNum;
        }
        return 0;
    }

    public Integer createOrder(Integer uid,Double total,List<Integer> numlist) throws Exception {
        if(uid>0 && total >0 && numlist.size()>0){
            Map<String,Object> mp=new HashMap<>();
            mp.put("uid",uid);
            mp.put("total",total);
            mp.put("number",numlist.size());
            mp.put("submissionTime",new Date());
            mp.put("paymentStatus",1); //未支付状态
            mp.put("showStatus",1);  //显示状态
            mp.put("receiving",0);   //收货状态
            mp.put("rid",0); //在确认订单页面需要修改
           return iorderser.insertNewOrder(mp);
        }
        return 0;
    }

    public Integer createOrderDetails( List<Integer> numlist,List<Integer> pidlist) throws Exception{
         //搜寻最大的订单oid
        int oid=iorderser.selectMaxId();
        if(pidlist.size()>0){
            int ordtsNum=0;
            for(int i=0;i<pidlist.size();i++){
                int pid=pidlist.get(i);
                int onumber=numlist.get(i);
                Orderdetails ords=new Orderdetails(0,oid,pid,onumber);
                ordtsNum += orderdetailsService.insert(ords);  //生成订单详情表
            }
           return ordtsNum;
        }
        return 0;
    }


    @RequestMapping(value="/querenddan",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public  Integer querenddan(@RequestParam Map<String,Object>mp)throws Exception{
            if(mp !=null){
               mp.put("submissionTime",new Date());
               int uporderNum=iorderser.updateOrder(mp);//修改地址 ，建立时间
                System.out.println("xiugai**mp="+mp);
                return uporderNum;
            }
       return 0;
    }


}
