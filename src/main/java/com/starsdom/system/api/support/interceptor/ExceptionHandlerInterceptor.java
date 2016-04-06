package com.starsdom.system.api.support.interceptor;

import com.starsdom.system.api.support.util.AjaxUtil;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Title: ExceptionHandlerInterceptor
 * Description: 异常拦截器， 拦截 Spring 全局异常， 并处理
 *
 * @author swe
 * @since 2016/4/5 0005
 */
public class ExceptionHandlerInterceptor implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        if (AjaxUtil.isAjaxRequest(request)) {

            //ajax 请求出现异常
            //ajax 返回格式是否应该统一？
            //如果统一， 应该设计成什么数据类型？


        } else {
            // 其他异常, 返回错误页面
            request.setAttribute("message", ex.getMessage());

            //404 与 500, 此处处理简单...未登陆情况??? 待 Session 添加
            return ex instanceof NoSuchRequestHandlingMethodException ? new ModelAndView("/common/404") : new ModelAndView("/common/500");

        }


        return null;
    }
}
