package com.starsdom.system.api.enums;

/**
 * @author huangkunhao
 * @since 2016/03/31
 */
public enum UserTypeEnum {

    NORMAL("普通用户"),
    ADMINISTRATOR("管理员");

    private String description;

    UserTypeEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
