package com.service.impl;

import com.entity.Shoppingcar;
import com.service.IShoppingcarService;
import com.dao.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
@Transactional
@MapperScan(basePackages = "com.dao")
@Service(value="shoppingcarService")
public class ShoppingcarService implements IShoppingcarService{
    @Autowired
    private IShoppingcarDao  ishpdao;

    @Override
    public List<Shoppingcar> selectShopCars(Map<String, Object> mp) {
        return ishpdao.selectShopCars(mp);
    }

    @Override
    public Integer insertShopcarMap(Map<String, Object> mp) {
        return ishpdao.insertShopcarMap(mp);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer cid) {
        return ishpdao.deleteByPrimaryKey(cid);
    }

    @Override
    public Integer updateShopcarOne(Map<String, Object> mp) {
        return ishpdao.updateShopcarOne(mp);
    }
}
