package com.service;

import com.pojo.User;

/**
 * Description:
 * date: 2021/6/22 21:30
 *
 * @author Jim Lin
 */
public interface TestService {
    public User test(int id);
    public void deleteById(Integer id);
    public void updateById(User user);
    public void addUser(User user);
}
