package edu.njtu.service;

import edu.njtu.model.User;

import java.util.List;

public interface LoginService {
    public User getUserInfoByUserName(String userName);
    public List<User> getUserList();
}
