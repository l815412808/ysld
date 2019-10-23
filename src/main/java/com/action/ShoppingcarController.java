package com.action;
import com.entity.*;
import java.util.*;
import com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(allowCredentials = "true",maxAge = 3600)
@RestController
public class ShoppingcarController {
    @Autowired
    private IShoppingcarService  ishpsce;

    @RequestMapping(value="/allshopcar",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public List<Shoppingcar> allshopcar(@RequestParam  Map<String,Object> mp)throws Exception{
        mp.put("showStatus",1);
        return ishpsce.selectShopCars(mp);
    }

    @RequestMapping(value = "/delshopid/{cid}",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public  Integer delshopid(@PathVariable(value="cid") Integer cid){
        return ishpsce.deleteByPrimaryKey(cid);
    }

    @RequestMapping(value="/updateshopcar",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Integer updateshopcar(@RequestParam Map<String,Object> mp){
        return ishpsce.updateShopcarOne(mp);
    }

}
