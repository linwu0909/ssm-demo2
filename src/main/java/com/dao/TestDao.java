package com.dao;

import com.pojo.User;

/**
 * Description:
 * date: 2021/6/22 21:30
 *
 * @author Jim Lin
 */
public interface TestDao {
    public User selectById(Integer id);
    public void deleteById(Integer id);
    public void updateById(User user);
    public void addUser(User user);
}
