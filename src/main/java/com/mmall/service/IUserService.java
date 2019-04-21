package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;


/**
 * Created by lyrics
 */
public interface IUserService{
    Object login(String username, String password);
}