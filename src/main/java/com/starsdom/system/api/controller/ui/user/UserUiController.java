package com.starsdom.system.api.controller.ui.user;

import com.starsdom.system.api.controller.ui.AbstractUiController;
import com.starsdom.system.api.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author huangkunhao
 * @since 2016/03/31
 */

@Controller
@RequestMapping("/user")
public class UserUiController extends AbstractUiController {

    /**
     * 去登录页面.
     * @return 登陆页面
     */
    @RequestMapping("/")
    public String toLogin(){
        return "/user/login";
    }

    @RequestMapping("/login")
    public String login(final UserVo userVo){
        System.out.print(userVo.getUserName());
        System.out.print(userVo.getUserPassword());
        return "redirect:/user/index";
    }
    @RequestMapping("/index")
    public String index(){
        return "/index";
    }
}
