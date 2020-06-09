package com.profinch.fincluez.finclueztlibrary.repo.martRepo;


import com.profinch.fincluez.finclueztlibrary.entities.martEntities.TransformationQueue;
import com.profinch.fincluez.finclueztlibrary.entities.martEntities.TransformationQueueCK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransformationQueueRepo extends JpaRepository<TransformationQueue, TransformationQueueCK> {
}
