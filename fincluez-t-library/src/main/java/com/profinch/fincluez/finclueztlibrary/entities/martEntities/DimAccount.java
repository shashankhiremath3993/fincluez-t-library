package com.profinch.fincluez.finclueztlibrary.entities.martEntities;

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
@IdClass(DimAccountCK.class)
public class DimAccount implements Serializable {

    @Id
    private String entityCode;
    @Id
    private String accountBrnKey;
    private String account;
    private String accountDesc;
    private String branchKey;
    private String productKey;
    private String currencyKey;
    private String customerKey;
    private String accountTypeKey;
    private String accountStatusKey;
    private Date dateAccountOpen;
    private Date dateStart;
    private String acctCountryKey;
    private String alternateAccountNo;
    private String derivedStatusKey;
    private Integer dormancyDays;
    private Date dateDormant;
    private String exposureCategory;
    private String fundId;
    private String ibanAccountNumber;
    private String modeOfOperation;
    private String noCrAllowed;
    private String noDrAllowed;
    private String passbookFacility;
    private String previousTodSince;
    private String accRecordStat;
    private String salaryAccount;
    private Date dateStatusSince;
    private String chequeBookFacility;
    private Integer chequeRejectionCount;
    private String clearingAccountNumber;
    private String clearingBankCode;
    private String drGl;
    private String crGl;
    private String location;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
