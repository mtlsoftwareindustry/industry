package com.mtl.software.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mtl.software.store.mapper.StoreMapper;
import com.mtl.software.store.service.ServiceStore;

@RestController
public class StoreController {

	@Autowired
	private StoreMapper storeMapper;

	@GetMapping("/store/{name}")
	public String getStore(@PathVariable String name) {
		ServiceStore serviceStore = storeMapper.getStore(name);
		String storeName = serviceStore.getName();
		return storeName;
	}
}
