package cn.stopyc.service;


import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface LogService {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void log(String out, String in, double money);
}
