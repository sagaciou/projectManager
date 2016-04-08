package com.starsdom.system.api.support;

/**
 * Title: Constants
 * Description: 常量类， 全局常量
 *
 * @author swe
 * @since 2016/4/5 0005
 */
public interface Constants {

    //ajax 请求头部
    String AJAX_REQUEST = "X-Requested-With";

    //Session 标志
    String USER_SESSION = "userInfo";

    // 用户Session信息标识
    String LOGIN_USER_IN_SESSION = "current_login_user";

    // 用户页面实体标识
    String LOGIN_USER = "loginUser";

    // 登录页URI
    String LOGIN_URI = "/user/login";

    // 模板标题定义符
    String PAGE_TITLE = "pageTitle";

    // 请求跳转头
    String X_FORWARDED_FOR_HEADER = "x-forwarded-for";

    // 密码和盐值拼接字符串
    String SALT_SPIT_CHAR = "(^_^)";


}
