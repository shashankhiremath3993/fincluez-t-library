package com.profinch.fincluez.finclueztlibrary.entities.martEntities.dim;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

public class DimBCStageCK implements Serializable {

    private String entityCode;
    private String stageCodeKey;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}