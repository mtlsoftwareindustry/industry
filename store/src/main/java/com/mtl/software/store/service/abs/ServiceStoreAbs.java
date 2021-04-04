package com.mtl.software.store.service.abs;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mtl.software.store.mapper.StoreMapper;
import com.mtl.software.store.service.ServiceStore;

@Component
public abstract class ServiceStoreAbs implements ServiceStore {

	private Logger logger = LoggerFactory.getLogger(ServiceStoreAbs.class);

	@Autowired
	private StoreMapper storeMapper;

	protected ServiceStoreAbs() {
		logger.info("Initializing service store abs " + getName());
	}

	@PostConstruct
	public void init() {
		logger.info("Initializing service store abs " + getName());
		storeMapper.map(getName(), this);
	}
}
