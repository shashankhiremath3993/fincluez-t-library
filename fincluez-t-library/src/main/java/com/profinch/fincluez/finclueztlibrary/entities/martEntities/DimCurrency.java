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
@IdClass(DimCurrencyCK.class)
public class DimCurrency implements Serializable {
    @Id
    private String entityCode;
    @Id
    private String currencyKey;
    private String currencyCode;
    private String currencyName;
    private String countryKey;
    private String colorCurrency;
    private String recordStat;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }


}
