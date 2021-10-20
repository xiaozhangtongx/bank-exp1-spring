package com.demo.bank.mapper;

import com.demo.bank.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhang
 * @version 1.0
 * @TODO 用户接口
 * @date 2021/10/14 星期四 11:51
 */

@Mapper
public interface UserMapper {

    public User getUserByMessage(Integer uid, String upassword);

    public List<User> getAllUser(Integer uid, String username, String uidnum, int pageStart, int pageSize);

    public int getUserCounts(Integer uid, String username, String uidnum);

    public int addUser(User user);

    public User getUpdateUser(int id);

    public int editUser(User user);

    public int deleteUser(int id);

    public User getUserByUidnum(String uidnum);

    public User getUserByUphonenum(String uphonenume);
}
