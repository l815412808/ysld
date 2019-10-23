package com.dao;

import com.entity.*;
import java.util.*;

public interface IShoppingcarDao {
       List<Shoppingcar> selectShopCars(Map<String,Object> mp);
       Integer insertShopcarMap(Map<String,Object> mp);
       Integer deleteByPrimaryKey(Integer cid);
       Integer updateShopcarOne(Map<String,Object> mp);

}
