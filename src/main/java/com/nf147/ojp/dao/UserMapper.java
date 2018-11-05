package com.nf147.ojp.dao;

import com.nf147.ojp.entity.User;

import java.util.List;

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int deleteByUserName(String userName);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    User selectByUserName(String userName);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    int updateByUserName(User record);

    int selectByNameAndPassword(User user);

    int updateStatus(User user);
}