package cn.dcg.demo.dao.user;


import cn.dcg.demo.domain.user.User;

public interface UserMapper {

    int deleteUserByUserId(Integer uid);

    User getUserById(Integer uid);

}
