package cn.stopyc.service.impl;

import cn.stopyc.dao.Result;
import cn.stopyc.dao.ResultEnum;
import cn.stopyc.dao.UserMapper;
import cn.stopyc.po.User;
import cn.stopyc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: spring_01_quickstart
 * @description:
 * @author: stop.yc
 * @create: 2022-07-18 15:42
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserMapper userMapper;

    @Override
    public Result<Integer> login(String username, String password) {

        User user = userMapper.selectByNameAndPassword(username, password);

        if (user == null) {
            return new Result<>(ResultEnum.PASSWORD_FAILED.getCode(), ResultEnum.PASSWORD_FAILED.getMsg(), -1);
        } else  {
            user.setPassword("");
            return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMsg(), user.getPosition());
        }
    }
}
