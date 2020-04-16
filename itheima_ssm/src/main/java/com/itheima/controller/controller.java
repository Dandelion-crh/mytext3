package com.itheima.controller;

import com.itheima.mapper.Account;
import com.itheima.mapper.User;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 类名: controller
 * 作者: crh
 * 日期: 2020/4/15 0015下午 6:20
 */
@Controller
@RequestMapping("/account")
public class controller {
    @Autowired
    private AccountService accountService;

    //查询科室
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Account> queryAll(){
        return accountService.queryAll();
    }


    //添加患者挂号信息
    @RequestMapping("/add")
    public String add(Account account){
        accountService.add(account);
        //重定向跳转到/account/queryAll
        return "redirec t:/account/queryAll";
    }


    //模糊根据患者名称查询患者信息
    @RequestMapping("/queryUserAll")
    @ResponseBody
    public List<User> queryUserAll(User user){
        return accountService.queryUserAll(user);
    }
}
