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
@IdClass(DimProductCK.class)
public class DimProduct implements Serializable {
    @Id
    private String entityCode;
    @Id
    private String productKey;
    private String product;
    private String productDescription;
    private String colorProduct;
    private String productBusinessKey;
    private String productCategoryKey;
    private String productTypeKey;
    private String prodType;
    private String productGroup;
    private String module;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
