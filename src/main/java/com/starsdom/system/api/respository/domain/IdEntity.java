package com.starsdom.system.api.respository.domain;

import java.io.Serializable;

/**
 * @author huangkunhao
 * @since 2016/03/31
 */
class IdEntity implements Serializable {

    private static final long serialVersionUID = 4785046291718330344L;

    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
