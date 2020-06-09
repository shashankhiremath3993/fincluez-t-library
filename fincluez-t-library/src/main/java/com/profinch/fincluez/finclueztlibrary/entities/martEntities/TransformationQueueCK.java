package com.profinch.fincluez.finclueztlibrary.entities.martEntities;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.sql.Date;

public class TransformationQueueCK implements Serializable {

    private String entityCode;
    private String branchCode;
    private String referenceNumber;
    private Date elRunDate;
    private String module;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}