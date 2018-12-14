package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.survey.User;
import com.example.demo.model.survey.UserExample;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserByCondition(User user) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(user.getUserName());
        return userMapper.selectByExample(example);
    }

    @Override
    public void updateUserByCondition(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(user.getUserName());
        userMapper.updateByExampleSelective(user, example);
    }

}
