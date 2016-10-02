package com.sweisker.fleet.telematik.backend.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vividsolutions.jts.geom.Geometry;

@Entity
@Table(name="vehicledevice")
public class VehicleDevice {

	@Id
	@GeneratedValue
	private int id;
	
	private int status;
	
	private Geometry currentposition;
	
	private int orderid;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Geometry getCurrentPosition() {
		return currentposition;
	}

	public void setCurrentPosition(Geometry currentPosition) {
		this.currentposition = currentPosition;
	}

	public int getOrder_id() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	@Override
	public String toString() {
		return "VehicleDevice [id=" + id + ", status=" + status + ", currentposition=" + currentposition + ", orderid="
				+ orderid + "]";
	}
	
	
}
