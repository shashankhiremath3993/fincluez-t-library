package com.profinch.fincluez.finclueztlibrary.entities.martEntities;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

public class DimBrokerCK implements Serializable {

    private String entityCode;
    private String brokerKey;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}