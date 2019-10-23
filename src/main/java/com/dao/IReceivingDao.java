package com.dao;
import com.entity.*;
import java.util.*;
public interface IReceivingDao {
        List<Receiving> selectAddresses(Map<String,Object> mp);
        Integer updateStatus(Map<String,Object>mp);
        Integer updateStatus2(Map<String,Object>mp);

}
