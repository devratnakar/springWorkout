package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;
import com.example.demo.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

	CloudVendorService cloudVendorService;
	public CloudVendorController(CloudVendorService cloudVendorService) {
		this.cloudVendorService = cloudVendorService;
	}
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloundVendorDEtails(@PathVariable("vendorId") String vendorId) {
		return  cloudVendorService.getCloudVendor(vendorId);
	}
	@GetMapping("/")
	public List<CloudVendor> getAllCloundVendorDEtails() {
		return  cloudVendorService.getAllCloudVendors();
	}
	@PostMapping("/")
	public String createCloundVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.createCloudVendor(cloudVendor);
		return "Cloud vendred addes";
		
	}
	@PutMapping("/")
	public String updateCloudVendorDeatils (@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.updateCloudVendor(cloudVendor);
		
		return "Cloud Updated addess";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloundVendorDEtails(@PathVariable("vendorId") String cloudId) {
		cloudVendorService.deleteCloudVendor(cloudId);
		return "deleted Sucessfully";
		
	}
	

}
