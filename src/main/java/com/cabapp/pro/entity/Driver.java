package com.cabapp.pro.entity;

 

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
 
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("driver")
public class Driver extends AbstractUser{
	
	

	 
	private int driverId;
	private String licenseNo;
	
	
 
	private float rating;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cab_Id")
	private Cab cab;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Dri_Id")
	private List<TripBooking> tripbookings;

	 
	

	 

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Driver(int userId, String username, String password, String mobileNumber, String email) {
		super(userId, username, password, mobileNumber, email);
		// TODO Auto-generated constructor stub
	}
	

	public Driver(int driverId, String licenseNo, float rating, Cab cab, List<TripBooking> tripbookings) {
		super();
		this.driverId = driverId;
		this.licenseNo = licenseNo;
		this.rating = rating;
		this.cab = cab;
		this.tripbookings = tripbookings;
	}

	public List<TripBooking> getTripbookings() {
		return tripbookings;
	}

	public void setTripbookings(List<TripBooking> tripbookings) {
		this.tripbookings = tripbookings;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}
	
	
	

}
