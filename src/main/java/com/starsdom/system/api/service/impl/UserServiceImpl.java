package com.starsdom.system.api.service.impl;

import com.starsdom.system.api.respository.domain.UserEntity;
import com.starsdom.system.api.respository.mapper.UserRepository;
import com.starsdom.system.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dgh on 2016/4/8.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity login(String username, String password) {
        UserEntity entity = new UserEntity();
        entity.setUserName(username);
        entity.setUserPassword(password);
        List<UserEntity> userList = userRepository.query(entity);
        if(!userList.isEmpty()){
            return entity;
        }
        return null;
    }
}
