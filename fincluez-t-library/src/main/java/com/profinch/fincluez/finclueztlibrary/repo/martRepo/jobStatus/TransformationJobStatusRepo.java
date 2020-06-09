package com.profinch.fincluez.finclueztlibrary.repo.martRepo.jobStatus;


import com.profinch.fincluez.finclueztlibrary.entities.martEntities.jobStatus.TransformationJobStatus;
import com.profinch.fincluez.finclueztlibrary.entities.martEntities.jobStatus.TransformationJobStatusCK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface TransformationJobStatusRepo extends JpaRepository<TransformationJobStatus, TransformationJobStatusCK> {
    public List<TransformationJobStatus> findTop1ByJobNameAndStepNameOrderByElRunDateDesc(String jobName, String stepName);
    public List<TransformationJobStatus> findByJobNameAndStepNameAndElRunDate(String jobName, String stepName, Date elRunDate);
}
