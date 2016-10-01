package com.sweisker.fleet.telematik.backend.controller;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;

@RestController
public class CustomerRestController {

	private TestBla testBla = new TestBla();
	private LoadingCache<String, String> loader;

	public CustomerRestController() {
		loader = CacheBuilder.newBuilder().maximumSize(1000).expireAfterWrite(20, TimeUnit.SECONDS).build(new TestBla());
	}

	@RequestMapping(value = "/car/{id}", method = RequestMethod.GET)
	public String getCar(@PathVariable String id) {
		try {
			return loader.get(id);
		} catch (ExecutionException e) {
			e.printStackTrace();
			return null;
		}
	}
}
