package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
	CloudVendor cloudVendor;
	
	
//	@GetMapping("{vendorId}")
//	public CloudVendor getCloundVendorDEtails(String vendorId) {
//		return new CloudVendor("V1","Rat","ram","shyam");
//	}
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloundVendorDEtails(String vendorId) {
		return  cloudVendor;
	}
	@PostMapping
	public String createCloundVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor=cloudVendor;
		return "Cloud vendred addes";
		
	}
	@PutMapping
	public String updateCloudVendorDeatils (@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor=cloudVendor;
		return "Cloud Updated addess";
	}
	
	@DeleteMapping
	public String deleteCloundVendorDEtails(@RequestBody String cloudId) {
		this.cloudVendor=null;
		return "deleted Sucessfully";
		
	}
	

}
