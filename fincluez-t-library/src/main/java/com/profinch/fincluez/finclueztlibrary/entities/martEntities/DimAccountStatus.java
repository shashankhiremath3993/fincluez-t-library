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
@IdClass(DimAccountStatusCK.class)
public class DimAccountStatus  implements Serializable {
    @Id
    private String entityCode;
    @Id
    private String accountStatusKey;
    private String statusCode;
    private String descrpt;
    private String businessValue;
    private String colorCode;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
