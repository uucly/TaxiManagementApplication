package com.sweisker.fleet.telematik.backend.database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleDeviceService extends JpaRepository<VehicleOrder, Integer>{
	
}
