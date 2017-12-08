package com.ershow.persistence.user.model;

import java.util.Date;

public class ErshowUser {
    private Integer id;

    private String mobile;

    private String password;

    private String nickName;

    private String userImage;

    private String realName;

    private String idCard;

    private String cardFrontImg;

    private String cardObverseImg;

    private String handCardImg;

    private String userAddress;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage == null ? null : userImage.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getCardFrontImg() {
        return cardFrontImg;
    }

    public void setCardFrontImg(String cardFrontImg) {
        this.cardFrontImg = cardFrontImg == null ? null : cardFrontImg.trim();
    }

    public String getCardObverseImg() {
        return cardObverseImg;
    }

    public void setCardObverseImg(String cardObverseImg) {
        this.cardObverseImg = cardObverseImg == null ? null : cardObverseImg.trim();
    }

    public String getHandCardImg() {
        return handCardImg;
    }

    public void setHandCardImg(String handCardImg) {
        this.handCardImg = handCardImg == null ? null : handCardImg.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}