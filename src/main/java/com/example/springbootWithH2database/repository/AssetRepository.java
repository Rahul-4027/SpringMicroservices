package com.example.springbootWithH2database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootWithH2database.model.Asset;

public interface AssetRepository extends JpaRepository<Asset, Long> {

}
