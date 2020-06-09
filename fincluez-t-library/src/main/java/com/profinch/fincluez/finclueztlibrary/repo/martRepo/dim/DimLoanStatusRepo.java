package com.profinch.fincluez.finclueztlibrary.repo.martRepo.dim;

import com.profinch.fincluez.finclueztlibrary.entities.martEntities.dim.DimLoanStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DimLoanStatusRepo extends JpaRepository<DimLoanStatus,String> {
}
