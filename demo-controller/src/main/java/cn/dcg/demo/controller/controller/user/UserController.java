package cn.dcg.demo.controller.controller.user;

import cn.dcg.demo.controller.controller.common.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    @RequestMapping("getUser")
    public void getUser(HttpServletResponse res){
        Map<String,Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("age",18);
        sendJson(map,res);
    }
}
