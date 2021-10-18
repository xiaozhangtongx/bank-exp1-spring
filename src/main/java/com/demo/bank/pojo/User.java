package com.demo.bank.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @author zhang
 * @version 1.0
 * @TODO 用户类
 * @date 2021/10/14 星期四 11:41
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /**
     * uid 用户的账号
     * username 用户的姓名
     * usex 用户的性别
     * ubirthday 用户的出生日期
     * upassword 用户密码
     * uidnum 用户的身份证号码
     * uphonenum 用户的手机号码
     * ustate 用户的状态
     * role 角色
     */
    private Integer uid;
    private String username;
    private String usex;
    private String upassword;
    private String uidnum;
    private String uphonenum;
    private Boolean ustate;
    private String role;
}
