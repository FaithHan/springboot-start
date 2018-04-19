package cn.faithhan.springbootstart.service;

import org.apache.catalina.User;

import java.util.List;

public interface UserService {

    List<User> selectList();
}
