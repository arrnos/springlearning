package com.arrnos.springlearning.mapper;

import com.arrnos.springlearning.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * mapper 接口
 * </p>
 *
 * @author arrnos
 * @since 2018-10-30
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}

