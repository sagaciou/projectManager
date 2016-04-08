package com.starsdom.system.api.controller.ui.user;

import com.starsdom.system.api.controller.ui.AbstractUiController;
import com.starsdom.system.api.respository.domain.UserEntity;
import com.starsdom.system.api.service.UserService;
import com.starsdom.system.api.service.impl.UserServiceImpl;
import com.starsdom.system.api.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 *
 * @author huangkunhao
 * @since 2016/03/31
 */

@Controller
@RequestMapping("/user")
public class UserUiController extends AbstractUiController {

    @Autowired
    private UserServiceImpl userService;

    /**
     * 去登录页面.
     * @return 登陆页面
     */
    @RequestMapping("/")
    public String toLogin(){
        return "/user/login";
    }

    @RequestMapping("/login")
    public String login(final UserVo userVo, HttpSession session, Model model){
        if(userVo.getUserName() == null || userVo.getUserName().length() == 0){
            model.addAttribute("userName","用户名不能为空");
        }
        if(userVo.getUserPassword() == null || userVo.getUserPassword().length() == 0){
            model.addAttribute("password","密码不能为空");
        }
        UserEntity userEntity = userService.login(userVo.getUserName(), userVo.getUserPassword());
        if (userEntity!=null){
            session.setAttribute("user_login",userEntity);
            return "redirect:/user/index";
        }

        return "redirect:/user/";
    }
    @RequestMapping("/index")
    public String index(){
        return "/index";
    }
}
