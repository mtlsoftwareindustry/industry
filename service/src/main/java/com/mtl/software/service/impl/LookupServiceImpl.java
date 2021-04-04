package com.mtl.software.service.impl;

import org.springframework.stereotype.Service;

import com.mtl.software.service.LookupService;
import com.mtl.software.store.service.abs.ServiceStoreAbs;

@Service
public class LookupServiceImpl extends ServiceStoreAbs implements LookupService {

	public String getName() {
		return "lookup";
	}

	@Override
	public void execute() {
		// TODO execute service
	}

	@Override
	public String lookup() {
		return null;
	}
}
