package cn.faithhan.springbootstart.mapper;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
@Mapper
public interface UserMapper {

    List<User> selectList();

}
