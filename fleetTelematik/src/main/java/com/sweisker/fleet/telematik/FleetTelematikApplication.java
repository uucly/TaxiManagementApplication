package com.sweisker.fleet.telematik;

import java.io.FileNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FleetTelematikApplication {
	
	@Autowired
	KaGraph graph;
	
	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(FleetTelematikApplication.class, args);
	}
}
