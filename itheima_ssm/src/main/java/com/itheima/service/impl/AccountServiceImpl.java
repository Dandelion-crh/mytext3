package com.itheima.service.impl;

import com.itheima.domain.AccountDao;
import com.itheima.mapper.Account;
import com.itheima.mapper.User;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuyp
 * @date 2020/04/13
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    //查询科室
    @Override
    public List<Account> queryAll() {
        return accountDao.queryAll();
    }

    //添加患者挂号信息
    @Override
    public void add(Account account) {
        accountDao.add(account);
    }

    //根据患者名称模糊查询
    @Override
    public List<User> queryUserAll(User user) {
        return accountDao.queryUserAll(user);
    }
}
