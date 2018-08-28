package cn.dcg.demo.controller.config;

import cn.dcg.demo.controller.base.ResultDTO;
import cn.dcg.demo.controller.base.SysCode;
import cn.dcg.demo.controller.controller.common.BaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GlobalExpectionHandler extends BaseController {

    @ExceptionHandler(value = {BindException.class})
    public void handleBindException(BindException exception, HttpServletResponse response){
        exception.printStackTrace();
        StringBuffer sb = new StringBuffer();
        for (FieldError error: exception.getBindingResult().getFieldErrors()) {
            sb.append(error.getDefaultMessage()).append('/');
        }
        if(!StringUtils.isEmpty(sb)){
            sb.deleteCharAt(sb.length()-1);
        }
        sendJson(ResultDTO.resultDTOError(SysCode.SYS_EXCEPTION_CODE,sb.toString()),response);

    }



    @ExceptionHandler(value=Exception.class)
    public void handleExpection(Exception exception, HttpServletResponse response){
        exception.printStackTrace();
        sendJson(ResultDTO.resultDTOError(),response);
    }
}
