package com.service;
import com.entity.*;
import java.util.*;
public interface IOrderdetailsService {
    Integer insert(Orderdetails ordtails);
    Integer updateByPrimaryKey(Orderdetails ordtails);
    Integer deleteByPrimaryKey(Integer orid);
    List<Orderdetails> selectOrdDatilses(Map<String,Object>mp);
    Orderdetails selectByPrimaryKey(Integer orid);

}
