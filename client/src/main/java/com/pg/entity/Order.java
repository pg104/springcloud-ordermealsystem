package com.pg.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private long id;
    private Menu menu;
    private User user;
    private Admin admin;
    private Date date;
    private int state;
}
