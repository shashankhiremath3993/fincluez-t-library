package com.profinch.fincluez.finclueztlibrary.entities.martEntities;

import com.profinch.fincluez.finclueztlibrary.constants.ProcessStatus;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Getter
@Setter
@IdClass(TransformationQueueCK.class)
public class TransformationQueue implements Serializable {
    @Id
    private String entityCode;
    @Id
    private String branchCode;
    @Id
    private String referenceNumber;
    @Id
    private Date elRunDate;
    @Id
    private String module;

    @Enumerated(EnumType.STRING)
    private ProcessStatus transformationProcessStatus;

    private Timestamp processedTimeStamp;
    private Timestamp queuedTimeStamp;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
