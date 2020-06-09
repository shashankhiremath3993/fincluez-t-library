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
@IdClass(DimBranchCK.class)
public class DimBranch implements Serializable {
    @Id
    private String entityCode;
    @Id
    private String branchKey;
    private String branch;
    private String branchName;
    private String branchDesc;
    private String colorBranch;
    private String branchBusinessKey;
    private String branchRegionKey;
    private Date dateCurrFinYearStart;
    private Date dateCurrFinYearEnd;
    private Date datePrevFinYearStart;
    private Date datePrevFinYearEnd;
    private String prevYear;
    private String prevPeriod;
    private String branchRecordStat;
    private String currYear;
    private String currPeriod;
    private String walkinCustomer;
    private String parentBranch;
    private String regionalOffice;
    private String branchLcy;
    private Date dateCurrQuarterStart;
    private Date dateCurrQuarterEnd;
    private Date dateCurrPeriodStart;
    private Date dateCurrPeriodEnd;
    private Date applicationDate;
    private Date datePrevWorking;
    private Date dateNextWorking;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }



}
