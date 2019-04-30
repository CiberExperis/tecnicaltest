package com.firabarcelona.seed.entities;

import com.firabarcelona.common.entities.AbstractAuditableEntity;
import com.firabarcelona.common.entities.AbstractEntity;
import com.firabarcelona.common.entities.AbstractMasterEntity;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "language")
public class Language extends AbstractMasterEntity {

    private String locale;

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}
