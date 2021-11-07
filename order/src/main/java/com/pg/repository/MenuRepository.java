package com.pg.repository;

import com.pg.entity.Menu;

import java.util.List;

public interface MenuRepository {
    public Menu findById(long id);
}
