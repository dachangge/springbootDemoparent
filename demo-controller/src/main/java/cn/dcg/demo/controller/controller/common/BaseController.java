package cn.dcg.demo.controller.controller.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* @Description: controller公共功能
* @Author: Mr.Deng
* @Date: 2018/8/21 14:55
*/
public class BaseController {
    protected final static Log log = LogFactory.getLog(BaseController.class);
    public void sendJson(Object obj, HttpServletResponse resp){
        try {
            resp.setContentType("application/json;uft-8");
            resp.setCharacterEncoding("UTF-8");
            resp.getWriter().print(JSON.toJSONStringWithDateFormat(obj,"yyyy-MM-dd HH:mm:ss",SerializerFeature.DisableCircularReferenceDetect));
            resp.getWriter().flush();
            resp.getWriter().close();
        } catch (IOException e) {
            log.info("输出json异常",e);
        }
    }
}
