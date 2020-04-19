package com.test.emplassetmngmnt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.emplassetmngmnt.beans.Asset;

@Repository
public interface AssetRepository extends CrudRepository<Asset, String> {
}
