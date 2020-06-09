package com.profinch.fincluez.finclueztlibrary.entities.maintEntities;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class MaintValueMapping implements Serializable {
    @Id
    private String mapType;
    private String flexcubeValue;
    private String businessValue;
    private String colorCode;
    private String entityCode;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
