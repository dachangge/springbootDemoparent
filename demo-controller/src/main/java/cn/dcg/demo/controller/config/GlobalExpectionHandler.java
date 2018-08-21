package cn.dcg.demo.controller.config;

import cn.dcg.demo.controller.controller.common.BaseController;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExpectionHandler extends BaseController {

    @ExceptionHandler(value=Exception.class)
    public void handleExpection(Exception exception, HttpServletResponse response){
        exception.printStackTrace();
        Map<String,Object> map = new HashMap<>();
        map.put("code","9999");
        map.put("description",exception.toString());
        sendJson(map,response);
    }
}
