package com.itheima.service;

import com.itheima.mapper.Account;
import com.itheima.mapper.User;

import java.util.List;

/**
 * @author liuyp
 * @date 2020/04/13
 */
public interface AccountService {
    List<Account> queryAll();

    void add(Account account);

    List<User>queryUserAll(User user);
}
