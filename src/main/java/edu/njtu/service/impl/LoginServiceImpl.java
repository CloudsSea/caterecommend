package edu.njtu.service.impl;


import edu.njtu.httpbody.login.*;
import edu.njtu.mapper.UserMapper;
import edu.njtu.model.User;
import edu.njtu.model.UserExample;
import edu.njtu.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserInfoByUserName(String userName) {
        return null;
    }

    public List<User> getUserList(){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdIsNotNull();
        return userMapper.selectByExample(userExample);
    }

    @Override
    public LoginDBody login(LoginABody userToLoginRequest) {
        return null;
    }

    @Override
    public ResetPasswordDBody resetPassword(ResetPasswordABody resetPasswordABody) {
        return null;
    }

    @Override
    public LoginDBody backLogin(BackLoginABody backLoginABody) {
        return null;
    }

    @Override
    public BackResetPasswordDBody backResetPassword(BackResetPasswordABody backResetPasswordABody) {
        return null;
    }

}
