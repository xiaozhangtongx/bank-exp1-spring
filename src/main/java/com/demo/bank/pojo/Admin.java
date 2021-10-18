package com.demo.bank.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @version 1.0
 * @TODO 业务员类
 * @date 2021/10/18 星期一 19:56
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    /**
     * uid 工号
     * username 业务员姓名
     * upassword 业务员登录密码
     * sex 性别
     * role 角色
     */
    private int uid;
    private String username;
    private int upassword;
    private String sex;
    private String role;
}
