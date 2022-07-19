package cn.stopyc.dao;

import cn.stopyc.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: spring_01_quickstart
 * @description:
 * @author: stop.yc
 * @create: 2022-07-17 16:16
 **/
//@Mapper
//@Repository
public interface UserMapper {


    @Select("select * from t_user where userName=#{username} and password=#{password}")
    User selectByNameAndPassword(@Param("username") String username,@Param("password") String password);

}
