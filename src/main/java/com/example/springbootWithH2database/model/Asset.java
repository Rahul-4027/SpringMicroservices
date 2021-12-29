package com.example.springbootWithH2database.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.ToString;

@Entity
@ToString
@Table(name="Asset")
public class Asset {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long AssetID;
	
    @Column
	private String FirstName;
    
    @Column
    private String LastName;
	
	@Column
	private Long EmpID;
	
	@Column
	private String AssetCategory;

	public String getAssetCategory() {
		return AssetCategory;
	}

	public void setAssetCategory(String assetCategory) {
		AssetCategory = assetCategory;
	}

	public Long getAssetID() {
		return AssetID;
	}

	public void setAssetID(Long assetID) {
		AssetID = assetID;
	}


	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public Long getEmpID() {
		return EmpID;
	}

	public void setEmpID(Long empID) {
		EmpID = empID;
	}
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
}
