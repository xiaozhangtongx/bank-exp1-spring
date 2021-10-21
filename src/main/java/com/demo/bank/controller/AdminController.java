package com.demo.bank.controller;

import com.demo.bank.mapper.AdminMapper;
import com.demo.bank.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author zhang
 * @version 1.0
 * @TODO 管理员控制类
 * @date 2021/10/18 星期一 20:18
 */

@RestController
public class AdminController {
    @Autowired
    private AdminMapper adminMapper;

    /**
     * 业务员登录
     *
     * @param admin 登录信息
     * @return 业务员信息
     */
    @RequestMapping("/alogin")
    public HashMap<String, Object> alogin(@RequestBody Admin admin) {
        String flag = "error";
        Admin adminByMessage = adminMapper.getAdminByMessage(admin.getUid(), admin.getUpassword());
        System.out.println(adminByMessage);
        if (adminByMessage != null) {
            flag = "ok";
        }
        HashMap<String, Object> loginData = new HashMap<>();
        loginData.put("flag", flag);
        loginData.put("data", adminByMessage);
        return loginData;
    }
}
