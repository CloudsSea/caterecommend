package edu.njtu.controller;

import edu.njtu.model.User;
import edu.njtu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Hai on 2019/3/15.
 */
@RequestMapping("/user")
@Controller
public class LoginController {

    @Resource
    public LoginService loginService;

    @RequestMapping("/login")
    public String login() {

        return "index";
    }

    @ResponseBody
    @RequestMapping("/userlist")
    public List<User> getUserList(){
        return loginService.getUserList();
    }

}

