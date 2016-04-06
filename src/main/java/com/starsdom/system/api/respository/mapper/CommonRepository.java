package com.starsdom.system.api.respository.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author huangkunhao
 * @since 2016/03/31
 */
@Repository
public interface CommonRepository {
    void executeSQL(@Param("sql") String sql);
}
