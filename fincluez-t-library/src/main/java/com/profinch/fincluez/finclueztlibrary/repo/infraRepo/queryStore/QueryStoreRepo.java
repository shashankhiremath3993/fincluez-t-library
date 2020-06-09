package com.profinch.fincluez.finclueztlibrary.repo.infraRepo.queryStore;

import com.profinch.fincluez.finclueztlibrary.entities.infraEntities.queryStore.QueryStore;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QueryStoreRepo extends JpaRepository<QueryStore,String> {

}
