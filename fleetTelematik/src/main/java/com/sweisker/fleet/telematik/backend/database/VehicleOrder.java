package com.sweisker.fleet.telematik.backend.database;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.vividsolutions.jts.geom.Geometry;

@Entity(name="vehicleorder")
public class VehicleOrder {

	@Id
	@GeneratedValue
	private long id;

	private Date date;
	
	private long deviceid;
	
	private int status;
	
	private int sourcecosts;
	
	private int targetcosts;
		
	private int waitcosts;
	
	private int totalcosts;
	
	private Geometry source;
	
	private Geometry target;

	public Geometry getTarget() {
		return target;
	}

	public void setTarget(Geometry target) {
		this.target = target;
	}

	public Geometry getSource() {
		return source;
	}

	public void setSource(Geometry source) {
		this.source = source;
	}

	public int getTotalcosts() {
		return totalcosts;
	}

	public void setTotalcosts(int totalcosts) {
		this.totalcosts = totalcosts;
	}

	public int getWaitcosts() {
		return waitcosts;
	}

	public void setWaitcosts(int waitcosts) {
		this.waitcosts = waitcosts;
	}


	public int getTargetcosts() {
		return targetcosts;
	}

	public void setTargetcosts(int targetcosts) {
		this.targetcosts = targetcosts;
	}

	public int getSourcecosts() {
		return sourcecosts;
	}

	public void setSourcecosts(int sourcecosts) {
		this.sourcecosts = sourcecosts;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public long getDeviceId() {
		return deviceid;
	}

	public void setDeviceId(long deviceId) {
		this.deviceid = deviceId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "VehicleOrder [id=" + id + ", date=" + date + ", deviceid=" + deviceid + ", status=" + status
				+ ", sourcecosts=" + sourcecosts + ", targetcosts=" + targetcosts + ", waitcosts=" + waitcosts
				+ ", totalcosts=" + totalcosts + ", source=" + source + ", target=" + target + "]";
	}
	
	
}
