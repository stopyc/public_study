package cn.stopyc.service;

import cn.stopyc.dao.Result;
import org.springframework.transaction.annotation.Transactional;


public interface UserService {

    Result<Integer> login(String username, String password);
}
