package com.profinch.fincluez.finclueztlibrary.entities.martEntities;


import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Entity
@Getter
@Setter
@IdClass(DimTenorLCCK.class)
public class DimTenorLC implements Serializable {
    @Id
    private String entityCode;
    @Id
    private String tenorBucketKey;
    private String tenorBucket ;
    private String colorTenorBucket;
    private Integer tenorSeqNo;
    private String colorCode;
    private Integer seqNo;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }


}
