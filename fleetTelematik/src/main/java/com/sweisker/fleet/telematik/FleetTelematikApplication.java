package com.sweisker.fleet.telematik;


import java.io.FileNotFoundException;
import java.io.InputStream;

import org.assertj.core.util.VisibleForTesting;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.cm.osm2po.routing.DefaultRouter;
import de.cm.osm2po.routing.Graph;

@SpringBootApplication
public class FleetTelematikApplication {

	private static final String PATH_TO_ROUTE_FILE = "/routeFile/osm_2po.gph";
	
	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(FleetTelematikApplication.class, args);
		Graph graph = new Graph(loadRouteStream());
		DefaultRouter router = new DefaultRouter();
		
		// Somewhere in Hamburg
		int sourceId = graph.findClosestVertexId(48.5f, 10.0f);
		//int targetId = graph.findClosestVertexId(53.4f, 10.1f);
		LoggerFactory.getLogger(FleetTelematikApplication.class).info("SourceId" + sourceId);
	}
	
	@VisibleForTesting
	static InputStream loadRouteStream() throws FileNotFoundException{
		InputStream routeFileStream = FleetTelematikApplication.class.getResourceAsStream(PATH_TO_ROUTE_FILE);
		if(routeFileStream == null){
			throw new FileNotFoundException();
		}
		
		return routeFileStream;
	}
}
