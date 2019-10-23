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
@Service(value="orderdetailsService")
public class OrderdetailsService implements IOrderdetailsService{

    @Autowired
    private  IOrderdetailsDao orderdetailsDao;
    @Override
    public Integer insert(Orderdetails ordtails) {
        return orderdetailsDao.insert(ordtails);
    }

    @Override
    public Integer updateByPrimaryKey(Orderdetails ordtails) {
        return orderdetailsDao.updateByPrimaryKey(ordtails);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer orid) {
        return orderdetailsDao.deleteByPrimaryKey(orid);
    }

    @Override
    public List<Orderdetails> selectOrdDatilses(Map<String, Object> mp) {
        return orderdetailsDao.selectOrdDatilses(mp);
    }

    @Override
    public Orderdetails selectByPrimaryKey(Integer orid) {
        return orderdetailsDao.selectByPrimaryKey(orid);
    }
}
