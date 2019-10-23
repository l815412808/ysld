package com.service;

import com.entity.*;
import java.util.*;
public interface IOrderService {
    Integer insertNewOrder(Map<String,Object> mp);
    Integer updateOrder(Map<String,Object> mp);
    Order selectByPrimaryKey(Integer oid);
    List<Order> selectorders(Map<String,Object> mp);
    Integer deleteByPrimaryKey(Integer oid);
    Integer selectMaxId();
}
