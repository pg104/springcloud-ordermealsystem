package com.pg.repository;

import com.pg.entity.User;

public interface UserRepository {
    public User login(String username,String password);
}
