package com.pack.AirportManagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plane")
public class Plane {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long planeId;
	private String carrierName;
	private String planeModel;
	private int seatCapacity;

	public Plane() {
		super();

	}

	public Plane(String carrierName, String planeModel, int seatCapacity) {
		super();
		this.carrierName = carrierName;
		this.planeModel = planeModel;
		this.seatCapacity = seatCapacity;
	}

	public Plane(long planeId, String carrierName, String planeModel, int seatCapacity) {
		super();
		this.planeId = planeId;
		this.carrierName = carrierName;
		this.planeModel = planeModel;
		this.seatCapacity = seatCapacity;
	}

	public long getPlaneId() {
		return planeId;
	}

	public void setPlaneId(long planeId) {
		this.planeId = planeId;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getPlaneModel() {
		return planeModel;
	}

	public void setPlaneModel(String planeModel) {
		this.planeModel = planeModel;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	@Override
	public String toString() {
		return "Plane [planeId=" + planeId + ", carrierName=" + carrierName + ", planeModel=" + planeModel
				+ ", seatCapacity=" + seatCapacity + "]";
	}

}
