package com.starsdom.system.api.controller.ui.api;

import com.starsdom.system.api.controller.ui.AbstractUiController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Title: ApiUiController
 * Description:
 *
 * @author swe
 * @since 2016/4/6 0006
 */
@Controller
@RequestMapping("/api")
public class ApiUiController extends AbstractUiController {

    @RequestMapping("/manager")
    public String apiManager(){
        return "/api/manager";
    }

}
