package com.arrnos.springlearning.service.impl;

import com.arrnos.springlearning.entity.User;
import com.arrnos.springlearning.mapper.UserMapper;
import com.arrnos.springlearning.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author arrnos
 * @since 2018-11-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
