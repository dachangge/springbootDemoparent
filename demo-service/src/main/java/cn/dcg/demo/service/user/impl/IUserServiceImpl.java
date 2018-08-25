package cn.dcg.demo.service.user.impl;

import cn.dcg.demo.dao.user.UserMapper;
import cn.dcg.demo.domain.user.User;
import cn.dcg.demo.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUerByUserId(Integer uid) {
        return userMapper.getUserById(uid);
    }

    @Override
    public int deleteUserById(Integer uid) {
        return userMapper.deleteUserByUserId(uid);
    }
}
