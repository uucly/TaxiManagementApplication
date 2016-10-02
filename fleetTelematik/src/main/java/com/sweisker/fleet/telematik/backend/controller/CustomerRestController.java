package com.sweisker.fleet.telematik.backend.controller;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.sweisker.fleet.telematik.backend.database.VehicleDeviceService;
import com.sweisker.fleet.telematik.backend.database.VehicleOrder;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;

import de.cm.osm2po.model.LatLon;
import de.cm.osm2po.service.GeoJson;

@RestController
public class CustomerRestController {

	@Autowired
	private VehicleDeviceService vehicleService;
	
	private TestBla testBla = new TestBla();
	private LoadingCache<String, String> loader;

	public CustomerRestController() {
		loader = CacheBuilder.newBuilder().maximumSize(1000).expireAfterWrite(20, TimeUnit.SECONDS).build(new TestBla());
	}

	@RequestMapping(value = "/car/{id}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<VehicleOrder> getCar(@PathVariable String id) throws JsonProcessingException {
		return vehicleService.findAll();
		/*try {
			return loader.get(id);
		} catch (ExecutionException e) {
			e.printStackTrace();
			return null;
		}*/
	}
}
