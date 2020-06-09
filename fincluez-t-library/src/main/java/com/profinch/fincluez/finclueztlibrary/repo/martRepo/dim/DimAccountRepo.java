package com.profinch.fincluez.finclueztlibrary.repo.martRepo.dim;


import com.profinch.fincluez.finclueztlibrary.entities.martEntities.dim.DimAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DimAccountRepo extends JpaRepository<DimAccount,String> {
}
