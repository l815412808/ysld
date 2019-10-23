package com.service;
import com.entity.*;
import java.util.*;

public interface IReceivingService {

    List<Receiving> selectAddresses(Map<String,Object> mp);
    Integer updateStatus(Map<String,Object>mp);
    Integer updateStatus2(Map<String,Object>mp);

}
