package com.firabarcelona.seed.entities;

import com.firabarcelona.common.entities.AbstractAuditableEntity;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bla_bla")
@SQLDelete(sql = "update bla_bla set deleted = 1 where id = ?")
@Where(clause="deleted=0")
public class BlaBla extends AbstractAuditableEntity {

    private String blabla;

    public String getBlabla() {
        return blabla;
    }

    public void setBlabla(String blabla) {
        this.blabla = blabla;
    }
}
