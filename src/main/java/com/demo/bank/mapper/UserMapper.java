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

    /**
     * 储户登录
     *
     * @param uid       储户账号
     * @param upassword 储户密码
     * @return 储户个人信息
     */
    public User getUserByMessage(Integer uid, String upassword);

    /**
     * 获取所有的储户信息
     *
     * @param uid       储户账号
     * @param username  用户名
     * @param uidnum    储户身份证号码
     * @param pageStart 开始页
     * @param pageSize  页面展示的数目
     * @return 所有储户的信息
     */
    public List<User> getAllUser(Integer uid, String username, String uidnum, int pageStart, int pageSize);

    /**
     * 获取用户数目
     *
     * @param uid      储户账号
     * @param username 用户名
     * @param uidnum   储户身份证号码
     * @return 用户数目
     */
    public int getUserCounts(Integer uid, String username, String uidnum);

    /**
     * 添加用户
     *
     * @param user 添加用户的信息
     * @return 添加的结果
     */
    public int addUser(User user);

    /**
     * 获取要修改用户
     *
     * @param id 用户的账号
     * @return 获取的结果
     */
    public User getUpdateUser(int id);

    /**
     * 修改用户
     *
     * @param user 修改用户的信息
     * @return 修改的结果
     */
    public int editUser(User user);

    /**
     * 删除储户
     *
     * @param id 储户账号
     * @return 删除的结果
     */
    public int deleteUser(int id);

    /**
     * 通过身份证获取用户信息
     *
     * @param uidnum 身份证号码
     * @return 用户信息
     */
    public User getUserByUidnum(String uidnum);

    /**
     * 通过电话号码获取用户信息
     *
     * @param uphonenume 储户电话号码
     * @return 储户的信息
     */
    public User getUserByUphonenum(String uphonenume);
}
