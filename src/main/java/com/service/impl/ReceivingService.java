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
@Service(value="receivingService")
public class ReceivingService implements IReceivingService{
    @Autowired
    private IReceivingDao  ireceivingdao;
    @Override
    public List<Receiving> selectAddresses(Map<String, Object> mp) {
        return ireceivingdao.selectAddresses(mp);
    }

    @Override
    public Integer updateStatus(Map<String, Object> mp) {
        return ireceivingdao.updateStatus(mp);
    }

    @Override
    public Integer updateStatus2(Map<String, Object> mp) {
        return ireceivingdao.updateStatus2(mp);
    }
}
