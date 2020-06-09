package com.profinch.fincluez.finclueztlibrary.entities.infraEntities.queryStore;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class DriverQueryStore implements Serializable {
    @Id
    private String idQuery = null;
    private String queryDescription = null;
    private String selectQueryString = null;
    private String fromQueryString = null;
    private String whereQueryString = null;
    private String sortQueryString = null;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
