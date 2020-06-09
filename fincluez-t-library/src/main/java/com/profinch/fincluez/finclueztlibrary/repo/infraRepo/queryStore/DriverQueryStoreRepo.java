package com.profinch.fincluez.finclueztlibrary.repo.infraRepo.queryStore;

import com.profinch.fincluez.finclueztlibrary.entities.infraEntities.queryStore.DriverQueryStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverQueryStoreRepo extends JpaRepository<DriverQueryStore,String> {
}
