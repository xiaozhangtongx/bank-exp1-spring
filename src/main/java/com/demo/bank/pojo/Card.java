package com.demo.bank.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @version 1.0
 * @TODO 银行卡类
 * @date 2021/10/16 星期六 22:22
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    /**
     * cid 银行卡账号
     * cpassword 银行卡密码
     * cstate 银行卡状态
     * money 余额
     * uid 用户账号
     * username 用户名
     */
    private int cid;
    private int cpassword;
    private boolean cstate;
    private Double money;
    private int uid;
    private String username;
}
