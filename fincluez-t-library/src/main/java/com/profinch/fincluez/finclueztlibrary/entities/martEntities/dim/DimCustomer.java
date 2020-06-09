package com.profinch.fincluez.finclueztlibrary.entities.martEntities.dim;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@IdClass(DimCustomerCK.class)
public class DimCustomer implements Serializable {
    @Id
    private String entityCode;
    @Id
    private String customerKey;
    private String customer;
    private String customerName;
    private String customerShortName;
    private String passportNo;
    private String uniqueIDDesc;
    private String uniqueID;
    private String incorpCountry;
    private Date incorpDate;
    private String rmKey;
    private String customerTypeKey;
    private String employmentTypeKey;
    private Date dateCustOpen;
    private String nationality;
    private String countryKey;
    private String customerCategoryKey;
    private String genderKey;
    private String customerType;
    private String employmentStatus;
    private String age;
    private String ageBucketKey;
    private Double salary;
    private String businessNature;
    private Double annualTurnover;
    private String custRecordStat;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }



}
