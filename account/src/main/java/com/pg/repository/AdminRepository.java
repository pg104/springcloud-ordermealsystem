package com.pg.repository;

import com.pg.entity.Admin;

public interface AdminRepository {
    public Admin login(String username,String password);
}
