package edu.njtu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hai on 2019/3/15.
 */
@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
