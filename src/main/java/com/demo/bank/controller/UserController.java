package com.demo.bank.controller;

import com.demo.bank.mapper.UserMapper;
import com.demo.bank.utils.QueryInfo;
import com.demo.bank.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author zhang
 * @version 1.0
 * @TODO 储户管理
 * @date 2021/10/14 星期四 15:14
 */
@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    /**
     * 储户登录
     *
     * @param user 登录信息
     * @return 该用户的信息
     */
    @RequestMapping("/login")
    public HashMap<String, Object> login(@RequestBody User user) {
        int id = user.getUid();
        String flag = "error";
        User userByMessage = null;
        if ((id + "").length() == 8) {
            userByMessage = userMapper.getUserByMessage(user.getUid(), user.getUpassword());
        } else {
            flag = "error";
        }
        if (userByMessage != null) {
            flag = "ok";
        }
        HashMap<String, Object> loginData = new HashMap<>();
        loginData.put("flag", flag);
        loginData.put("data", userByMessage);
        return loginData;
    }

    /**
     * 获取用户列表
     *
     * @param queryInfo 查询的信息
     * @return 用户列表
     */
    @RequestMapping("/userlist")
    public HashMap<String, Object> getUserList(@RequestBody QueryInfo queryInfo) {
        int userCounts = userMapper.getUserCounts(queryInfo.getUid(), "%" + queryInfo.getUsername() + "%", queryInfo.getUidnum());
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();
        List<User> allUser = userMapper.getAllUser(queryInfo.getUid(), "%" + queryInfo.getUsername() + "%", queryInfo.getUidnum(), pageStart, queryInfo.getPageSize());
        System.out.println(allUser.size());
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("number", userCounts);
        hashMap.put("data", allUser);
        return hashMap;
    }

    @RequestMapping("/getuserbyuidnum")
    public String getUserByUidnum(@RequestBody User user) {
        System.out.println(user);
        User userByUidnum = userMapper.getUserByUidnum(user.getUidnum());
        System.out.println(userByUidnum);
        String flag = "success";
        if (userByUidnum != null) {
            flag = "error";
        }
        return flag;
    }

    @RequestMapping("/getuserbyph")
    public String getUserByUphonenum(@RequestBody User user) {
//        System.out.println(user);
        User userByUidnum = userMapper.getUserByUphonenum(user.getUphonenum());
        String flag = "success";
        if (userByUidnum != null) {
            flag = "error";
        }
        return flag;
    }

    /**
     * 新增用户
     *
     * @param user 新增的用户信息
     * @return 新增的结果
     */
    @RequestMapping("/adduser")
    public String addUser(@RequestBody User user) {
        System.out.println(user);
        int i = userMapper.addUser(user);
        return i > 0 ? "success" : "error";
    }

    /**
     * 获取需要修改信息的储户
     *
     * @param uid 用户的账号
     * @return 修改用户的信息
     */
    @RequestMapping("/getupdate")
    public User getUpdateUser(int uid) {
        System.out.println("编号:" + uid);
        User updateUser = userMapper.getUpdateUser(uid);
        return updateUser;
    }

    /**
     * 修改用户信息
     *
     * @param user 新的用户信息
     * @return 修改的结果
     */
    @RequestMapping("/edituser")
    public String editUser(@RequestBody User user) {
        System.out.println(user);
        int i = userMapper.editUser(user);
        return i > 0 ? "success" : "error";
    }

    /**
     * 删除用户
     *
     * @param uid 用户的账号
     * @return 删除操作的结果
     */
    @RequestMapping("/deleteuser")
    public String deleteUser(int uid) {
        System.out.println(uid);
        int i = userMapper.deleteUser(uid);
        return i > 0 ? "success" : "error";
    }
}
