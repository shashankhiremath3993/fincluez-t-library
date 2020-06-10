package com.profinch.fincluez.finclueztlibrary.repo.martRepo;


import com.profinch.fincluez.finclueztlibrary.entities.martEntities.TransformationJobStatus;
import com.profinch.fincluez.finclueztlibrary.entities.martEntities.TransformationJobStatusCK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface TransformationJobStatusRepo extends JpaRepository<TransformationJobStatus, TransformationJobStatusCK> {
    public List<TransformationJobStatus> findTop1ByJobNameAndStepNameOrderByElRunDateDesc(String jobName, String stepName);
    public List<TransformationJobStatus> findByJobNameAndStepNameAndElRunDate(String jobName, String stepName, Date elRunDate);
}
