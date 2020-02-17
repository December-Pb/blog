package com.jackie.blog.service;

import com.jackie.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
