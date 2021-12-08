package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GpsCoordinates{

	@JsonProperty("altitude")
	private int altitude;

	@JsonProperty("latitude")
	private double latitude;

	@JsonProperty("longitude")
	private double longitude;

	public void setAltitude(int altitude){
		this.altitude = altitude;
	}

	public int getAltitude(){
		return altitude;
	}

	public void setLatitude(double latitude){
		this.latitude = latitude;
	}

	public double getLatitude(){
		return latitude;
	}

	public void setLongitude(double longitude){
		this.longitude = longitude;
	}

	public double getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"GpsCoordinates{" + 
			"altitude = '" + altitude + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}