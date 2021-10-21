package com.demo.bank.mapper;

import com.demo.bank.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhang
 * @version 1.0
 * @TODO 业务员接口
 * @date 2021/10/18 星期一 20:03
 */

@Mapper
public interface AdminMapper {
    /**
     * 业务员登录
     *
     * @param uid       工号
     * @param upassword 登录密码
     * @return 业务员个人信息
     */
    public Admin getAdminByMessage(Integer uid, int upassword);
}
