package com.satishlabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.satishlabs.entity.Owner;
import com.satishlabs.repo.OwnerRepository;

@Service
@Transactional
public class OwnerServiceImpl implements OwnerService{
	@Autowired
	private OwnerRepository ownerRepository;

	@Override
	public Owner saveOwner(Owner owner) {
		return ownerRepository.save(owner);
	}

	@Override
	public Owner getOwnerById(Integer id) {
		return ownerRepository.findById(id).get();
	}

}
