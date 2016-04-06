package com.starsdom.system.api.support.util;

import javax.servlet.http.HttpServletRequest;

/**
 * Title: AjaxUtil
 * Description: Ajax 相关方法。
 *
 * @author swe
 * @since 2016/4/5 0005
 */
public class AjaxUtil {

    /**
     * 工具类， 构造器私有
     */
    private AjaxUtil(){

    }

    /**
     * 判断请求是否是 AJAX 请求.
     * @param request HttpServletRequest request， 使用 request 耦合 ??
     * @return 是否是 AJAX 请求.
     */
    public static boolean isAjaxRequest(final HttpServletRequest request) {
        String requestedWith = request.getHeader("X-Requested-With");
        return requestedWith != null && "XMLHttpRequest".equals(requestedWith);
    }

}
