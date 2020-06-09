package com.profinch.fincluez.finclueztlibrary.repo.martRepo.dim;

import com.profinch.fincluez.finclueztlibrary.entities.martEntities.dim.DimStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DimStatusRepo extends JpaRepository<DimStatus,String> {
}
