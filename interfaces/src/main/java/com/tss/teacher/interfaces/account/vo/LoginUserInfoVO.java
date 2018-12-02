package com.tss.teacher.interfaces.account.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author MQG
 * @date 2018/11/30
 */
public class LoginUserInfoVO<T> {
    private long userId;
    private String userAcc;
    private String name;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date expireDate;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private String sessionId;

    private T extra;

    public String getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(String userAcc) {
        this.userAcc = userAcc;
    }

    public T getExtra() {
        return extra;
    }

    public void setExtra(T extra) {
        this.extra = extra;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
