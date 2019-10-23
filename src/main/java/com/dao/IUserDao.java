package com.dao;
import com.entity.*;
import java.util.*;
public interface IUserDao {
    User selectByPrimaryKey(Integer uid);
}
