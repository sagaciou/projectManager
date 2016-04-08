package com.starsdom.system.api.service;

import com.starsdom.system.api.respository.domain.UserEntity;

/**
 * Created by dgh on 2016/4/8.
 */
public interface UserService {
    /**
     * 用户登录
     *
     * @param username 用户名
     * @param password 用户密码
     * @return 密码校验结果
     */
    UserEntity login(String username, String password);
}
