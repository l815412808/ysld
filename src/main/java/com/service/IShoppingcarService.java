package com.service;
import com.entity.*;
import java.util.*;
public interface IShoppingcarService {
    List<Shoppingcar> selectShopCars(Map<String,Object> mp);
    Integer insertShopcarMap(Map<String,Object> mp);
    Integer deleteByPrimaryKey(Integer cid);
    Integer updateShopcarOne(Map<String,Object> mp);
}
