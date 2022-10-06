package com.satishlabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satishlabs.entity.Owner;
import com.satishlabs.service.OwnerService;

@RestController
@RequestMapping("/owner")
public class OwnerController {
	@Autowired
	private OwnerService ownerService;
	
	@PostMapping("/saveowner")
	public Owner saveOwner(@RequestBody Owner owner) {
		Owner ownerOut = ownerService.saveOwner(owner);
		return ownerOut;
	}
	
	@GetMapping("/getowner/{id}")
	public Owner getOwner(@PathVariable Integer id) {
		Owner ownerOut = ownerService.getOwnerById(id);
		return ownerOut;
	}
}
