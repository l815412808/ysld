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
public class ReceivingController {
    @Autowired
    private IReceivingService  receivingService;

    @RequestMapping(value="/updateStatus",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public  Integer  updateStatus(@RequestParam Map<String,Object>mp) throws Exception{
        System.out.println("dizhi**mp="+mp);
        if(mp!=null){
            int uid=0;
            int rid=0;
            try{
                uid=Integer.valueOf(mp.get("uid").toString());
                rid=Integer.valueOf(mp.get("rid").toString());
            }catch (Exception e){
                uid=0;
                rid=0;
            }
         Map<String,Object> nm=new HashMap<>();
            nm.put("uid",uid);
            nm.put("adressStatus",1);//默认dizhi
            List<Receiving> relist=receivingService.selectAddresses(nm);

            Receiving  mrobj=relist.get(0);
           // System.out.println(mrobj);
            int oldrid=0;

                //修改此状态为0

               nm.put("adressStatus",0) ;
               nm.put("rid",mrobj.getRid());

              oldrid=receivingService.updateStatus2(nm);
             // System.out.println(oldrid);
            //System.out.println("old**nm="+nm);
             int newrid=0;

              //修改新的rid 的状态
                nm.put("adressStatus",1);
                nm.put("rid",rid);  //传入id 为新默认地址
                newrid=receivingService.updateStatus2(nm);
                //System.out.println(newrid);
           // System.out.println("new**nm="+nm);
            return newrid;
        }
        return 0;
    }



}
