package com.thoughtworks.bbs.service;

import com.thoughtworks.bbs.model.User;

import java.util.List;

public interface UserService {
    User get(long id);

    List<User> getAll();

    ServiceResult<User> save(User user);

    void delete(User user);

    User getByUsername(String username);
}
