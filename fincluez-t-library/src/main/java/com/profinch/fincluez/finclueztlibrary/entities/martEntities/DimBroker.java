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
@IdClass(DimBrokerCK.class)
public class DimBroker implements Serializable {
    @Id
    private String entityCode;
    @Id
    private String brokerKey;
    private String broker;
    private String name;
    private String street;
    private String city;
    private String country;
    private String bookingMethod;
    private String payableCcy;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
