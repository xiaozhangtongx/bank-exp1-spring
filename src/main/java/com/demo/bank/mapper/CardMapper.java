package com.demo.bank.mapper;

import com.demo.bank.pojo.Card;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhang
 * @version 1.0
 * @TODO 银行卡管理接口
 * @date 2021/10/16 星期六 22:26
 */

@Mapper
public interface CardMapper {
    /**
     * 获取账户银行卡的信息
     *
     * @param cid        银行卡卡号
     * @param uid        银行卡账户
     * @param cpageStart 当前页
     * @param cpageSize  页面的大小
     * @return 银行卡信息
     */
    public List<Card> getAllCard(Integer cid, Integer uid, int cpageStart, int cpageSize);

    /**
     * 获取行卡的数目
     *
     * @param cid 银行卡卡号
     * @param uid 银行卡账户
     * @return
     */
    public int getCardCounts(Integer cid, Integer uid);

    /**
     * 存款
     *
     * @param card 卡对象
     * @return
     */
    public int saveMoney(Card card);

    /**
     * 取款
     *
     * @param card
     * @return
     */
    public int getMoney(Card card);

    /**
     * 储户查询自己账户下银行卡的信息
     *
     * @param uid 账号
     * @return 银行卡信息
     */
    public List<Card> getAllUcard(Integer uid);

    /**
     * 修改银行卡密码
     *
     * @param cid       银行卡卡号
     * @param cpassword 银行卡密码
     * @return 修改的结果
     */
    public int changeCpwd(int cid, int cpassword);

}
