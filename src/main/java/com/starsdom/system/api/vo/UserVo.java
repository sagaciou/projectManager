/*
 * Copyright (c) 2008, 2015, OneAPM and/or its affiliates. All rights reserved. 
 */
package com.starsdom.system.api.vo;

import java.io.Serializable;
import com.starsdom.system.api.enums.UserTypeEnum;

/**
 * Title: UserVo
 * Description:
 *
 * @author huangkunhao
 * @since 2016/03/31
 *
 */
public class UserVo implements Serializable {

    private static final long serialVersionUID = 5141327549459769174L;
    private String userName;

    private String userIdentity;

    private String userEmail;

    private String userPassword;

    private String userPasswordConfirm;

    private UserTypeEnum userType;


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

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPasswordConfirm() {
        return userPasswordConfirm;
    }

    public void setUserPasswordConfirm(String userPasswordConfirm) {
        this.userPasswordConfirm = userPasswordConfirm;
    }

    public UserTypeEnum getUserType() {
        return userType;
    }

    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }
}
