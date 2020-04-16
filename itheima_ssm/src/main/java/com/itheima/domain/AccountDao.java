package com.itheima.domain;

import com.itheima.mapper.Account;
import com.itheima.mapper.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author liuyp
 * @date 2020/04/13
 */
public interface AccountDao {
    @Select("select * from accounts")
    List<Account> queryAll();

    @Insert("insert into account(name,gender,did) values(#{name},#{gender},#{did})")
    void add(Account account);

    List<User> queryUserAll(User user);
}
