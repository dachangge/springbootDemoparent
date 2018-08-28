package cn.dcg.demo.service.user;

import cn.dcg.demo.domain.user.User;

public interface IUserService {


    User findUerByUserId(Integer UserId);

    int deleteUserById(Integer uid);


}
