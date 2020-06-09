package com.profinch.fincluez.finclueztlibrary.repo.martRepo.dim;

import com.profinch.fincluez.finclueztlibrary.entities.martEntities.dim.DimCountry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DimCountryRepo extends JpaRepository<DimCountry,String> {
}
