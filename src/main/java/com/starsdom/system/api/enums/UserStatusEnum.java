package com.starsdom.system.api.enums;

/**
 * @author huangkunhao
 * @since 2016/03/31
 */
public enum UserStatusEnum {
    AWAIT("待激活"),
    NORMAL("正常状态"),
    TEMP_FROZEN("临时冻结"),
    FROZEN("冻结"),
    DELETED("已删除");

    private String description;

    UserStatusEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
