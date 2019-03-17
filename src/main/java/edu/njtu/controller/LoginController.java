package edu.njtu.controller;

import edu.njtu.httpbody.login.*;
import edu.njtu.model.User;
import edu.njtu.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Hai on 2019/3/15.
 */
@RequestMapping("/login")
@Controller
public class LoginController {
    //TODO 日志抽象出一个aop
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    public LoginService loginService;

    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/index")
    public String login() {
        return "index";
    }

    @ResponseBody
    @RequestMapping("/login")
    public LoginDBody login(LoginABody userToLoginRequest) {
        return loginService.login(userToLoginRequest);
    }

    @ResponseBody
    @RequestMapping("/resetpassword")
    public ResetPasswordDBody resetPassword(ResetPasswordABody resetPasswordABody) {
        ResetPasswordDBody resetPasswordDBody = new ResetPasswordDBody();
        try {
            resetPasswordDBody = loginService.resetPassword(resetPasswordABody);
            return resetPasswordDBody;
        }catch (Exception e){
            logger.error("获取餐馆列表错误:",e);
            //FIXME  抽象出一个过滤器,捕捉错误
            resetPasswordDBody.setCode("40000");
            resetPasswordDBody.setMsg("获取餐馆列表错误");
            resetPasswordDBody.setSubCode(e.getMessage());
            resetPasswordDBody.setSubMsg(e.getMessage());
        }
        return resetPasswordDBody;

    }

//---------------------------------------------------------------------
//---------------------------------------------------------------------
//------------------以下为后台人员相关的登录逻辑-----------------------
//---------------------------------------------------------------------
//---------------------------------------------------------------------
    @RequestMapping("/backindex")
    public String backLogin() {
        return "backindex";
    }

    @ResponseBody
    @RequestMapping("/backlogin")
    public LoginDBody backLogin(BackLoginABody backLoginABody) {
        return loginService.backLogin(backLoginABody);
    }

    @ResponseBody
    @RequestMapping("/backresetpassword")
    public BackResetPasswordDBody backResetPassword(BackResetPasswordABody backResetPasswordABody) {
        return loginService.backResetPassword(backResetPasswordABody);
    }

    @ResponseBody
    @RequestMapping("/userlist")
    public List<User> getUserList(){
        return loginService.getUserList();
    }

}

