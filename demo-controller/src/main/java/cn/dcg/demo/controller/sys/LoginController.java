package cn.dcg.demo.controller.sys;

import cn.dcg.demo.controller.base.ResultDTO;
import cn.dcg.demo.controller.controller.common.BaseController;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
public class LoginController extends BaseController {
    @RequestMapping("/logindo.htm")
    public void login(@Valid LoginParam loginParam, HttpServletResponse res){
        sendJson(ResultDTO.resultDTOSucc(),res);
    }
}

@Data
class LoginParam{
    @NotBlank(message = "账号为空")
    private String loginName;
    @NotBlank(message = "登录密码为空")
    private String passWord;
}