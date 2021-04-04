package com.mtl.software.store.mapper;

import com.mtl.software.store.service.ServiceStore;

public interface StoreMapper {
	void map(String name, ServiceStore serviceStore);
	ServiceStore getStore(String name);
}
