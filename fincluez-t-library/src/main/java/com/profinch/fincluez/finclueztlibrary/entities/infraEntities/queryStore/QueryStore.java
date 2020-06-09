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
public class QueryStore implements Serializable {
    @Id
    private String idQuery = null;
    private String databaseType = null;
    private String queryDescription = null;
    private String queryString = null;
    private String queryType = null;
    private Integer nbrParams = 0;
    private String responseBean = null;
    private Boolean isEnabled = true;
    private Integer batchSize = 0;
    private Boolean isCompressionRequired = false;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}

