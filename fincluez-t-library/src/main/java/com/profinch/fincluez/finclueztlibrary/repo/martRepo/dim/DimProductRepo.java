package com.profinch.fincluez.finclueztlibrary.repo.martRepo.dim;

import com.profinch.fincluez.finclueztlibrary.entities.martEntities.dim.DimProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DimProductRepo extends JpaRepository<DimProduct,String> {
}
