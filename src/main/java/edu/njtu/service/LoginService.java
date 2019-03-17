package edu.njtu.service;

import edu.njtu.httpbody.login.*;
import edu.njtu.model.User;

import java.util.List;

public interface LoginService {
    public User getUserInfoByUserName(String userName);
    public List<User> getUserList();

    LoginDBody login(LoginABody userToLoginRequest);

    ResetPasswordDBody resetPassword(ResetPasswordABody resetPasswordABody);

    LoginDBody backLogin(BackLoginABody backLoginABody);

    BackResetPasswordDBody backResetPassword(BackResetPasswordABody backResetPasswordABody);
}
