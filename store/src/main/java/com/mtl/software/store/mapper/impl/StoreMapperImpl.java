package com.mtl.software.store.mapper.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.mtl.software.store.mapper.StoreMapper;
import com.mtl.software.store.service.ServiceStore;

@Component
public class StoreMapperImpl implements StoreMapper {

	private Map<String, ServiceStore> map = new HashMap<>();

	public void map(String name, ServiceStore serviceStore) {
		map.put(name, serviceStore);
	}

	@Override
	public ServiceStore getStore(String name) {
		return map.get(name);
	}
}
