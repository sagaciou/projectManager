package com.starsdom.system.api.respository.mapper;

import com.starsdom.system.api.respository.domain.UserEntity;

import java.util.List;

/**
 *
 * @author huangkunhao
 * @since 2016/03/31
 */
public interface UserRepository {

    /**
     * 获取用户.
     * @param userEntity 用户部分信息
     * @return 用户
     */
    List<UserEntity> findUser(UserEntity userEntity);
}
