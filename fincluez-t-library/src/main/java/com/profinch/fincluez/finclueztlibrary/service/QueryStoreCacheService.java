package com.profinch.fincluez.finclueztlibrary.service;


import com.profinch.fincluez.finclueztlibrary.entities.infraEntities.queryStore.DriverQueryStore;
import com.profinch.fincluez.finclueztlibrary.entities.infraEntities.queryStore.QueryStore;
import com.profinch.fincluez.finclueztlibrary.repo.infraRepo.queryStore.DriverQueryStoreRepo;
import com.profinch.fincluez.finclueztlibrary.repo.infraRepo.queryStore.QueryStoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class QueryStoreCacheService {

    @Autowired
    private QueryStoreRepo queryStoreRepo;
    @Autowired
    private DriverQueryStoreRepo driverQueryStoreRepo;
    @Autowired
    private CacheManager cacheManager;


    @Cacheable(value = "queryStore", key="#idQuery")
    public QueryStore getQueryStoreByIdQuery(String idQuery){

        Optional<QueryStore> QueryStoreOptional = queryStoreRepo.findById(idQuery);
        if (QueryStoreOptional.isPresent()){
            return QueryStoreOptional.get();
        }
        return null;
    }

    @CacheEvict(value = "queryStore", allEntries = true)
    public List<String> evictAllQueryStoreCache(){
        List<String> stringList = new ArrayList<>();
        stringList.add("Cache-Cleared");
        return stringList;
    }

    @PostConstruct
    public void init() {
        loadAllQueryStoreIntoCache();
        loadAllDriverQueryStoreIntoCache();

    }

    public void loadAllQueryStoreIntoCache() {
        for (QueryStore queryStore : queryStoreRepo.findAll()) {
            cacheManager.getCache("queryStore").put(queryStore.getIdQuery(), queryStore);
        }
    }
     public void loadAllDriverQueryStoreIntoCache() {
         for (DriverQueryStore driverQueryStore : driverQueryStoreRepo.findAll()) {
             cacheManager.getCache("driverQueryStore").put(driverQueryStore.getIdQuery(), driverQueryStore);
         }
    }


}
