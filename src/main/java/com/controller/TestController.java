package com.controller;

import com.pojo.User;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * date: 2021/6/22 21:30
 *
 * @author Jim Lin
 */
@RequestMapping("/test")
@RestController
public class TestController {
    @Autowired
    private TestService testService;
    // 查询
    @RequestMapping("/query")
    public User test(int id) {
        return testService.test(id);
    }
    // 删除
    @RequestMapping("/delete")
    public void deleteUser(Integer id) {
        testService.deleteById(id);
    }
    // 更新
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void updateUser(@RequestBody User user) throws Exception{
        try {
            testService.updateById(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 增加
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        testService.addUser(user);
    }
}
