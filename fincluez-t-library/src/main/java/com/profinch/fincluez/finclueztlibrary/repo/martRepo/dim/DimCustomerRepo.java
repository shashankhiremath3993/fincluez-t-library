package com.profinch.fincluez.finclueztlibrary.repo.martRepo.dim;

import com.profinch.fincluez.finclueztlibrary.entities.martEntities.dim.DimCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DimCustomerRepo extends JpaRepository<DimCustomer,String> {
}
