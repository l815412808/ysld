package com.dao;

import java.util.*;
import com.entity.*;

public interface IOrderDao {
        Integer insertNewOrder(Map<String,Object> mp);
        Integer updateOrder(Map<String,Object> mp);
        Order selectByPrimaryKey(Integer oid);
        List<Order> selectorders(Map<String,Object> mp);
        Integer deleteByPrimaryKey(Integer oid);
        Integer selectMaxId();


}
