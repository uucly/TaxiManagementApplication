package com.sweisker.fleet.telematik;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import de.cm.osm2po.routing.DefaultRouter;

@Component
public class AStarRouter {

	//private final DefaultRouter router;
	private final Properties params;
	private final KaGraph graph;
	
	@Autowired
	public AStarRouter(KaGraph graph){
		this.graph = graph;
		//router = new DefaultRouter();
		params = new Properties();
		params.setProperty("findShortestPath", "false");
		params.setProperty("ignoreRestrictions", "false");
		params.setProperty("ignoreOneWays", "false");
		params.setProperty("heuristicFactor", "1.0"); // 0.0 Dijkstra, 1.0 good A*
	}
	
	public int[] find(int source, int target){
		return null;
		//return router.findPath(graph, source, target, Float.MAX_VALUE, params);
	}
}
