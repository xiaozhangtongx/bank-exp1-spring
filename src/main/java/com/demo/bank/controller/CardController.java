package com.demo.bank.controller;

import com.demo.bank.mapper.CardMapper;
import com.demo.bank.pojo.Card;
import com.demo.bank.utils.QueryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author zhang
 * @version 1.0
 * @TODO 银行卡管理类
 * @date 2021/10/16 星期六 22:40
 */

@RestController
public class CardController {
    @Autowired
    CardMapper cardMapper;

    /**
     * 获取银行卡信息
     *
     * @param queryInfo 银行卡查询的信息
     * @return 银行卡信息
     */
    @RequestMapping("/cardlist")
    public HashMap<String, Object> getCardList(@RequestBody QueryInfo queryInfo) {
        int cardCounts = cardMapper.getCardCounts(queryInfo.getCid(), queryInfo.getUid());
        int pageStart = (queryInfo.getCpageNum() - 1) * queryInfo.getCpageSize();
        List<Card> allCard = cardMapper.getAllCard(queryInfo.getCid(), queryInfo.getUid(), pageStart, queryInfo.getCpageSize());
        System.out.println(allCard);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("number", cardCounts);
        hashMap.put("data", allCard);
        return hashMap;
    }

    /**
     * 存款
     *
     * @param card 银行卡信息
     * @return 存款的结果
     */
    @RequestMapping("/savemoney")
    public String saveMoney(@RequestBody Card card) {
        System.out.println(card);
        int i = cardMapper.saveMoney(card);
        return i > 0 ? "success" : "error";
    }

    /**
     * 取款
     *
     * @param card 银行卡信息
     * @return 取款的结果
     */
    @RequestMapping("/getmoney")
    public String getMoney(@RequestBody Card card) {
        System.out.println(card);
        int i = cardMapper.getMoney(card);
        return i > 0 ? "success" : "error";
    }

    /**
     * 获取当前用户的信息
     *
     * @param uid 用户账号
     * @return 该用户所有的银行卡
     */
    @RequestMapping("/ucardlist")
    public HashMap<String, Object> getUcardList(int uid) {
        List<Card> allCard = cardMapper.getAllUcard(uid);
        System.out.println(allCard);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("data", allCard);
        return hashMap;
    }

    /**
     * 修改银行卡密码
     *
     * @param card 银行卡信息
     * @return 修改的结果
     */
    @RequestMapping("/changecpwd")
    public String changeCpwd(@RequestBody Card card) {
        System.out.println(card);
        int i = cardMapper.changeCpwd(card.getCid(), card.getCpassword());
        return i > 0 ? "success" : "error";
    }

}
