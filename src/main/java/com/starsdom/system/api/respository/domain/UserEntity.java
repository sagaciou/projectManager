package com.starsdom.system.api.respository.domain;

import com.starsdom.system.api.enums.UserStatusEnum;
import com.starsdom.system.api.enums.UserTypeEnum;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * @author huangkunhao
 * @since 2016/03/31
 */
@Alias("UserEntity")
public class UserEntity extends IdEntity {

    private static final long serialVersionUID = -3889140819418257706L;

    /**
     * 用户昵称.
     */
    private String userName;

    /**
     * 用户唯一标识
     */
    private String userIdentity;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户类型,
     */
    private UserTypeEnum userType;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 上一次登录时间
     */
    private Date lastLoginDate;

    /**
     * 用户状态
     */
    private UserStatusEnum userStatus;

    private String userSalt;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public UserTypeEnum getUserType() {
        return userType;
    }

    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public UserStatusEnum getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatusEnum userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }
}
