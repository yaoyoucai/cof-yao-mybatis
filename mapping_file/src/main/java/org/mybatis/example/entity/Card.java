package org.mybatis.example.entity;

/**
 * @author huanyao
 * @version 1.0
 * @ClassName Card.java
 * @Description 身份证实体类
 * @date 2021/8/4 4:42 下午
 */
public class Card {
    //身份证id
    private Integer cardId;
    //身份证号码
    private String cardNum;
    //身份证地址
    private String address;

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
