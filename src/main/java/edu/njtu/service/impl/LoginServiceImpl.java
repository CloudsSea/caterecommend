package edu.njtu.service.impl;


import edu.njtu.httpbody.login.*;
import edu.njtu.mapper.UserMapper;
import edu.njtu.model.User;
import edu.njtu.model.UserExample;
import edu.njtu.service.LoginService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
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
//        userExample.createCriteria().andIdUserIsNotNull();
        return userMapper.selectByExample(userExample);
    }

    @Override
    public LoginDBody login(LoginABody userToLoginRequest, HttpSession session) throws Exception {
        session.setAttribute("userInfo",LoginServiceImpl.getUserById(userMapper,null,new Long(userToLoginRequest.getUserName())));
        LoginDBody loginDBody = new LoginDBody();
        loginDBody.setCode("10000");
        loginDBody.setMsg("SUCCESS");
        return loginDBody;
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

    public static User getUserById(UserMapper userMapper,String userId,Long userLongId) throws Exception {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        if (StringUtils.isNotBlank(userId)) {
            criteria.andUserIdEqualTo(userId);
        }
        if (null != userLongId && 0 != userLongId) {
            criteria.andUserIdIntEqualTo(userLongId);
        }
        List<User> userList = userMapper.selectByExample(userExample);
        if(0 == userList.size()){
            throw new Exception("无效的用户id");
        }else{
            return userList.get(0);
        }
    }

}
