package com.lanchong.conf;

import com.lanchong.common.Common;
import com.lanchong.common.MapUtils;
import com.lanchong.exception.BaseException;
import com.lanchong.exception.JsonRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.TypeMismatchException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@Slf4j
public class MyControllerAdvice {

    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(HttpServletRequest request,Exception ex) {
        trace(request,ex);
        Map map = new HashMap();
        map.put("code", 500);
        map.put("msg", "请联系客服！");
        return map;
    }
    
    /**
     * 拦截捕捉自定义异常 JsonRequestException.class
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = JsonRequestException.class)
    public Map myErrorHandler(HttpServletRequest request,JsonRequestException ex) {
        trace(request,ex);
        Map map = new HashMap();
        map.put("code", ex.getCode());
        map.put("msg", ex.getMessage());
        return map;
    }

    private void trace(HttpServletRequest request, Exception ex) {
        if (ex instanceof BaseException ){
            log.info(String.format("%s[%s](%s):[%s]->%s", request.getRequestURI(),
                    Common.getIpAddr(request),
                    MapUtils.getParameters(request),
                    request.getHeader("User-Agent"), ((BaseException) ex).getDetailMessage()));
           
        }else if(ex instanceof TypeMismatchException) {
            log.info(String.format("%s[%s](%s):[%s]->%s", request.getRequestURI(),
                    Common.getIpAddr(request),
                    MapUtils.getParameters(request),
                    request.getHeader("User-Agent"), ex.getMessage()));
        } else if (ex instanceof RuntimeException) {
            log.warn(String.format("%s[%s](%s):[%s]->%s", request.getRequestURI(),
                    Common.getIpAddr(request),
                    MapUtils.getParameters(request),
                    request.getHeader("User-Agent"), ex.getMessage()), ex);
        } else {
            log.error(String.format("%s[%s](%s):[%s]->%s", request.getRequestURI(),
                    Common.getIpAddr(request),
                    MapUtils.getParameters(request),
                    request.getHeader("User-Agent"), ex.getMessage()), ex);
        }
    }

}