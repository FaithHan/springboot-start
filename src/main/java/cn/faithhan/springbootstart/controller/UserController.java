package cn.faithhan.springbootstart.controller;


import cn.faithhan.springbootstart.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userIndex")
    public String userIndex(ModelMap modelMap) {
        List<User> users = userService.selectList();
        modelMap.put("users", users);
        return "userIndex";
    }


}
