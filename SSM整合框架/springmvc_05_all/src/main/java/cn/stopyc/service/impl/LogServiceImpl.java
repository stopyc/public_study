package cn.stopyc.service.impl;

import cn.stopyc.dao.LogMapper;
import cn.stopyc.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: spring_01_quickstart
 * @description:
 * @author: stop.yc
 * @create: 2022-07-19 08:58
 **/
@Service
public class LogServiceImpl implements LogService {


    @Autowired
    private LogMapper logMapper;

    @Override

    public void log(String out, String in, double money) {
        logMapper.log(out,in,money);
    }
}
