package com.sweisker.fleet.telematik.backend.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vividsolutions.jts.geom.Geometry;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JSonTest {

	private String name;

	@JsonRawValue
	private Geometry geom;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Geometry getGeom() {
		return geom;
	}

	public void setGeom(Geometry geom) {
		this.geom = geom;
	}
}
