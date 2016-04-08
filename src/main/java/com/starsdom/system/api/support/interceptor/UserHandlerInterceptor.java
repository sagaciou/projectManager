package com.starsdom.system.api.support.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * Created by dgh on 2016/4/8.
 */
public class UserHandlerInterceptor extends HandlerInterceptorAdapter {
    //排除路径
    private List<String> excludedUrls;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        for (String url : excludedUrls) {
            if (requestURI.endsWith(url)) {
                return true;
            }
        }
        HttpSession session = request.getSession();
        System.out.println(session.getAttribute("user_login"));
        if (session.getAttribute("user_login") == null) {
            response.sendRedirect("/user/");
            return false;
        } else {
            return true;
        }
    }

    public void setExcludedUrls(List<String> excludedUrls) {
        this.excludedUrls = excludedUrls;
    }
}
