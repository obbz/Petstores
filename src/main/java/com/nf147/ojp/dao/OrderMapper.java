package com.nf147.ojp.dao;

import com.nf147.ojp.entity.Order;

import java.util.HashMap;
import java.util.List;

public interface OrderMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    Order selectByPrimaryKey(Integer id);

    HashMap<String, Integer> countByStatus();

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}