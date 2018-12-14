package com.example.demo.service;

import com.example.demo.model.survey.User;

import java.util.List;


public interface IUserService {

    List<User> getUserByCondition(User user);

    void updateUserByCondition(User user);
}
