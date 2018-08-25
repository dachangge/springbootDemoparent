package cn.dcg.demo.controller.controller.user;

import cn.dcg.demo.controller.base.ResultDTO;
import cn.dcg.demo.controller.base.SysCode;
import cn.dcg.demo.controller.controller.common.BaseController;
import cn.dcg.demo.domain.user.User;
import cn.dcg.demo.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController extends BaseController {
    @Autowired
    private IUserService iUserService;


    @RequestMapping("deleteUserById")
    public void deleteUserById(Integer uid,HttpServletResponse res){
        iUserService.deleteUserById(uid);
        sendJson(ResultDTO.resultDTOSucc(),res);

    }

    @RequestMapping("getUserById")
    public void getUser(Integer uid,HttpServletResponse res){
        User user = iUserService.findUerByUserId(uid);
        sendJson(ResultDTO.resultDTOSucc(user),res);

    }
}
