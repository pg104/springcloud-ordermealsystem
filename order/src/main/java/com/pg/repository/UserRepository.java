package com.pg.repository;

import com.pg.entity.User;

import java.util.List;

public interface UserRepository {
    public User findById(long id);
}
