package com.nf147.ojp.dao;

import com.nf147.ojp.entity.Order;
import com.nf147.ojp.test.BaseSpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class OrderMapperTest extends BaseSpringTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void deleteByPrimaryKey() {
        orderMapper.deleteByPrimaryKey(8);

    }

    @Test
    public void insert() {
        orderMapper.insert(new Order(1, 12, new Date(), "placed", false));
    }

    @Test
    public void selectByPrimaryKey() {
        orderMapper.selectByPrimaryKey(1);
    }

    @Test
    public void countByStatus() {
       orderMapper.countByStatus();
    }
    @Test
    public void selectAll() {
        orderMapper.selectAll();
    }
}