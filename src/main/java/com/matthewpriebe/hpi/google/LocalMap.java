package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocalMap{

	@JsonProperty("image")
	private String image;

	@JsonProperty("link")
	private String link;

	@JsonProperty("gps_coordinates")
	private GpsCoordinates gpsCoordinates;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setGpsCoordinates(GpsCoordinates gpsCoordinates){
		this.gpsCoordinates = gpsCoordinates;
	}

	public GpsCoordinates getGpsCoordinates(){
		return gpsCoordinates;
	}

	@Override
 	public String toString(){
		return 
			"LocalMap{" + 
			"image = '" + image + '\'' + 
			",link = '" + link + '\'' + 
			",gps_coordinates = '" + gpsCoordinates + '\'' + 
			"}";
		}
}