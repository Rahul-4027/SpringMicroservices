package com.example.springbootWithH2database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootWithH2database.model.Asset;
import com.example.springbootWithH2database.repository.AssetRepository;

@RestController
@CrossOrigin
@RequestMapping("/asset")
public class AssetController {

	@Autowired
	private AssetRepository repository;
	
	@CrossOrigin
	@PostMapping
	public Asset addAsset(@RequestBody Asset asset) {
		//System.out.println(Asset.getname);
		return repository.save(asset);
	}
	
	@GetMapping
	public List<Asset> getAllAsset(){
		return repository.findAll();
	}
}