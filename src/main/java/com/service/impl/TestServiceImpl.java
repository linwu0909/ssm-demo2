package com.service.impl;

import com.dao.TestDao;
import com.pojo.User;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description:
 * date: 2021/6/22 21:31
 *
 * @author Jim Lin
 */
@Service("testService")
@Transactional
public class TestServiceImpl implements TestService{
    @Autowired
    private TestDao testDao;

    @Override
    public User test(int id) {
        User user = testDao.selectById(id);
//        System.out.println(user);
        return user;
    }

    @Override
    public void deleteById(Integer id) {
        testDao.deleteById(id);
    }

    @Override
    public void updateById(User user) {
        System.out.println(user.toString());
        testDao.updateById(user);
    }

    @Override
    public void addUser(User user) {
        testDao.addUser(user);
    }
}
