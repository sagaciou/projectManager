package com.starsdom.system.api.respository.mapper;

import com.starsdom.system.api.respository.domain.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author huangkunhao
 * @since 2016/03/31
 */
@Repository
public interface UserRepository {

    List<UserEntity> query(UserEntity entity);

}
