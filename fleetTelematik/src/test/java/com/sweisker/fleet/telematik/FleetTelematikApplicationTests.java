package com.sweisker.fleet.telematik;

import java.io.FileNotFoundException;

import org.junit.Test;
import static org.junit.Assert.*;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class FleetTelematikApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void loadRouteFile() throws FileNotFoundException{
		FleetTelematikApplication.loadRouteStream();
		assertTrue(true);
	}

}
