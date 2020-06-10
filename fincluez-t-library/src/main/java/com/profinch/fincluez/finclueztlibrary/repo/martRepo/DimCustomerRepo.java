package com.profinch.fincluez.finclueztlibrary.repo.martRepo;

import com.profinch.fincluez.finclueztlibrary.entities.martEntities.DimCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DimCustomerRepo extends JpaRepository<DimCustomer,String> {
}
