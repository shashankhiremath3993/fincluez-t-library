package com.profinch.fincluez.finclueztlibrary.repo.martRepo.dim;

import com.profinch.fincluez.finclueztlibrary.entities.martEntities.dim.DimCurrency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DimCurrencyRepo extends JpaRepository<DimCurrency,String> {
}
