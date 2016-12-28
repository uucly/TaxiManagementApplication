package com.sweisker.fleet.telematik;

import java.io.FileNotFoundException;
import java.io.InputStream;

import org.springframework.stereotype.Component;

import de.cm.osm2po.routing.Graph;

@Component
public class KaGraph extends Graph{

	private static final String PATH_TO_ROUTE_FILE = "/routeFile/osm_2po.gph";
	
	public KaGraph() throws FileNotFoundException{
		super(loadRouteStream());
	}
	
	private static InputStream loadRouteStream() throws FileNotFoundException{
		InputStream routeFileStream = KaGraph.class.getResourceAsStream(PATH_TO_ROUTE_FILE);
		if(routeFileStream == null){
			throw new FileNotFoundException();
		}
		return routeFileStream;
	}
}
