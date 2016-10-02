package com.sweisker.fleet.telematik.backend.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.sweisker.fleet.telematik.backend.database.VehicleDeviceService;

@RestController
public class CustomerRestController {

	@Autowired
	private VehicleDeviceService vehicleService;
	
	private TestBla testBla = new TestBla();
	private LoadingCache<String, String> loader;

	public CustomerRestController() {
		loader = CacheBuilder.newBuilder().maximumSize(1000).expireAfterWrite(20, TimeUnit.SECONDS).build(new TestBla());
	}

	@RequestMapping(value = "/car/{id}", method = RequestMethod.GET)
	public String getCar(@PathVariable String id) {
		System.out.println(vehicleService.findAll());
		return null;
		/*try {
			return loader.get(id);
		} catch (ExecutionException e) {
			e.printStackTrace();
			return null;
		}*/
	}
}
