package com.toby.spring.user.service;

import com.toby.spring.user.domain.User;

public interface UserService {
    void add(User user);

    void upgradeLevels();
}
