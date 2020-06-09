package com.profinch.fincluez.finclueztlibrary.entities.martEntities.dim;

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
@IdClass(DimBCStageCK.class)
public class DimBCStage implements Serializable {

    @Id
    private String entityCode;
    @Id
    private String stageCodeKey;
    private String stageCode;
    private String stageDesc;
    private String stageColorCode;
    private String mapType;
    private String flexcubeValue;
    private String businessValue;
    private String colorCode;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }



}
