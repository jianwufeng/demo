package com.example.demo.controller;

import com.example.demo.common.res.RestResponseEntity;
import com.example.demo.model.survey.User;
import com.example.demo.service.IUserService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "loginFtl", method = RequestMethod.GET)
    public String loginFtl() {
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public RestResponseEntity login(HttpServletRequest request, Model model, @RequestBody User user) {
        HttpSession session = request.getSession();
        List<User> userList = userService.getUserByCondition(user);
        if (CollectionUtils.isNotEmpty(userList)) {
            if (!user.getPassword().equals(userList.get(0).getPassword())) {
                return RestResponseEntity.getEntity(false);
            } else {
                session.setAttribute("loginUser", userList.get(0));
                model.addAttribute("loginUser", userList.get(0));
                return RestResponseEntity.getEntity(true);

            }
        } else {
            return RestResponseEntity.getEntity(false);
        }

    }
}
