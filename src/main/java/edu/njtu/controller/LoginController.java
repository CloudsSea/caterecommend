package edu.njtu.controller;

import edu.njtu.httpbody.login.LoginABody;
import edu.njtu.httpbody.login.LoginDBody;
import edu.njtu.httpbody.login.ResetPasswordABody;
import edu.njtu.httpbody.login.ResetPasswordDBody;
import edu.njtu.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Hai on 2019/3/15.
 */
@RequestMapping("/login")
@Controller
@Api("用户api")
public class LoginController {
    //TODO 日志抽象出一个aop
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    public LoginService loginService;


    @ApiOperation(value="用户登录")
    @ResponseBody
    @RequestMapping(value="/login.do",method= RequestMethod.POST)
    public LoginDBody login(LoginABody userToLoginRequest, HttpSession session) {
        LoginDBody loginDBody = new LoginDBody();
        try {
            return loginService.login(userToLoginRequest,session);
        }catch (Exception e){
            logger.error("获取餐馆列表错误:",e);
            //FIXME  抽象出一个过滤器,捕捉错误
            loginDBody.setCode("40000");
            loginDBody.setMsg("User login fail");
            loginDBody.setSubCode(e.getMessage());
            loginDBody.setSubMsg(e.getMessage());
        }
        return loginDBody;
    }

    @ApiOperation(value="用户登出")
    @ResponseBody
    @RequestMapping(value="/loginout.do",method= RequestMethod.POST)
    public void loginOut(HttpSession session) {
        logger.info("hello");
        logger.error("world");
        session.setAttribute("userInfo",null);
    }
    @ApiOperation(value="重置密码")
    @ResponseBody
    @RequestMapping(value="/resetpassword",method= RequestMethod.PUT)
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

    @ApiOperation(value="获取code")
    @ResponseBody
    @RequestMapping(value="/authcode.do",method= RequestMethod.GET)
    public void authCode(String code, HttpSession session) {
        session.setAttribute("code",code);
    }
    @ApiOperation(value="获取code")
    @ResponseBody
    @RequestMapping(value="/getcode.do",method= RequestMethod.GET)
    public String getCode(HttpSession session) {
        String code  = (String) session.getAttribute("code");
        return code;
    }

//---------------------------------------------------------------------
//---------------------------------------------------------------------
//------------------以下为后台人员相关的登录逻辑-----------------------
//---------------------------------------------------------------------
//---------------------------------------------------------------------
//    @RequestMapping("/backindex")
//    public String backLogin() {
//        return "backindex";
//    }
//
//    @ResponseBody
//    @RequestMapping("/backlogin")
//    public LoginDBody backLogin(BackLoginABody backLoginABody) {
//        return loginService.backLogin(backLoginABody);
//    }
//
//    @ResponseBody
//    @RequestMapping("/backresetpassword")
//    public BackResetPasswordDBody backResetPassword(BackResetPasswordABody backResetPasswordABody) {
//        return loginService.backResetPassword(backResetPasswordABody);
//    }
//
//    @ResponseBody
//    @RequestMapping("/userlist")
//    public List<User> getUserList(){
//        return loginService.getUserList();
//    }
//
//
//    @Resource
//    public InsertTableTools insertTableTools;
//    @RequestMapping("/insert")
//    public String insertTable(int index){
//        insertTableTools.readFile(index);
//        return "index.html";
//    }
//
//    @RequestMapping("/create")
//    public String createFile(){
//        try {
//            String separator = File.separator;
//            //String filePath = this.getClass().getResource("/").getPath()+File.separator;
//            //String filePath = separator+"opt"+separator+"install"+separator+"docker"+separator+"caterecommend"+separator;
//            String filePath = "D:\\Yun\\Yun2018\\软件架构和云服务\\data\\";
//
//            logger.info(filePath);
//            String fileName= "FilteredReview";
//            String formatType = "review";
//            FileTools.fileFormat(filePath, fileName, "json", formatType);
//            System.out.println("over4");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "index.html";
//    }
}

