package com.profinch.fincluez.finclueztlibrary.repo.maintRepo;

import com.profinch.fincluez.finclueztlibrary.entities.maintEntities.MaintValueMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintValueMappingRepo extends JpaRepository<MaintValueMapping,String> {
}
