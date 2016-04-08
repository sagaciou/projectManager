package com.starsdom.system.api.support.interceptor;

import static com.starsdom.system.api.support.Constants.USER_SESSION;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Title: SessionHandlerInterceptor
 * Description:
 *
 * @author swe
 * @since 2016/4/8 0008
 */
public class SessionHandlerInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (request.getSession().getAttribute(USER_SESSION) != null) {
            response.sendRedirect("/index");
        }

        return false;
    }
}
