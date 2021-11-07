package com.pg.repository;

import com.pg.entity.Menu;

import java.util.List;

public interface MenuRepository {

    public List<Menu> findAll(int index,int limit);
    public Menu findById(long id);
    public int count();
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(long id);
}
