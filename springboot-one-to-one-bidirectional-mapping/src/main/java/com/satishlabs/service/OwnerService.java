package com.satishlabs.service;

import com.satishlabs.entity.Owner;

public interface OwnerService {
	public Owner saveOwner(Owner owner);
	public Owner getOwnerById(Integer id);
}
