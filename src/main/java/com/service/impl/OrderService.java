package com.service.impl;

import com.entity.*;
import com.service.*;
import java.util.*;
import com.dao.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@MapperScan(basePackages = "com.dao")
@Service(value="orderService")
public class OrderService implements  IOrderService{
    @Autowired
    private  IOrderDao iorderdao;

    @Override
    public Integer insertNewOrder(Map<String, Object> mp) {
        return iorderdao.insertNewOrder(mp);
    }

    @Override
    public Integer updateOrder(Map<String, Object> mp) {
        return iorderdao.updateOrder(mp);
    }

    @Override
    public Order selectByPrimaryKey(Integer oid) {
        return iorderdao.selectByPrimaryKey(oid);
    }

    @Override
    public List<Order> selectorders(Map<String, Object> mp) {
        return iorderdao.selectorders(mp);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer oid) {
        return iorderdao.deleteByPrimaryKey(oid);
    }

    @Override
    public Integer selectMaxId() {
        return iorderdao.selectMaxId();
    }
}
