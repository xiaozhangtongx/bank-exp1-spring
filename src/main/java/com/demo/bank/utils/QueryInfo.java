package com.demo.bank.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @version 1.0
 * @TODO 储户查询搜索类
 * @date 2021/10/14 星期四 15:16
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryInfo {
    /**
     * uid 储户的账号
     * username 储户的姓名
     * uidnum 储户的身份证号码
     * pageNum 当前页
     * pageSize 页面数
     */
    private Integer uid;
    private String username;
    private String uidnum;
    private int pageNum = 1;
    private int pageSize = 1;

    /**
     * cid 银行卡卡号
     * cpageNum 存取款管理当前页
     * cpageSize  存取款管理页面数
     */
    private Integer cid;
    private int cpageNum = 1;
    private int cpageSize = 1;
}
