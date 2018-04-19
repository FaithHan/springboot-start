package cn.faithhan.springbootstart.service.impl;

import cn.faithhan.springbootstart.mapper.UserMapper;
import cn.faithhan.springbootstart.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectList() {
        return userMapper.selectList();
    }
}
