package com.dao;
import com.entity.*;
import java.util.*;

public interface IOrderdetailsDao {
    Integer insert(Orderdetails ordtails);
    Integer updateByPrimaryKey(Orderdetails ordtails);
    Integer deleteByPrimaryKey(Integer orid);
    List<Orderdetails> selectOrdDatilses(Map<String,Object>mp);
    Orderdetails selectByPrimaryKey(Integer orid);
}
