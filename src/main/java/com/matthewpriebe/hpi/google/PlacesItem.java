package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlacesItem{

	@JsonProperty("place_id_search")
	private String placeIdSearch;

	@JsonProperty("hours")
	private String hours;

	@JsonProperty("thumbnail")
	private String thumbnail;

	@JsonProperty("address")
	private String address;

	@JsonProperty("reviews")
	private int reviews;

	@JsonProperty("lsig")
	private String lsig;

	@JsonProperty("rating")
	private double rating;

	@JsonProperty("position")
	private int position;

	@JsonProperty("title")
	private String title;

	@JsonProperty("type")
	private String type;

	@JsonProperty("gps_coordinates")
	private GpsCoordinates gpsCoordinates;

	@JsonProperty("place_id")
	private String placeId;

	public void setPlaceIdSearch(String placeIdSearch){
		this.placeIdSearch = placeIdSearch;
	}

	public String getPlaceIdSearch(){
		return placeIdSearch;
	}

	public void setHours(String hours){
		this.hours = hours;
	}

	public String getHours(){
		return hours;
	}

	public void setThumbnail(String thumbnail){
		this.thumbnail = thumbnail;
	}

	public String getThumbnail(){
		return thumbnail;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setReviews(int reviews){
		this.reviews = reviews;
	}

	public int getReviews(){
		return reviews;
	}

	public void setLsig(String lsig){
		this.lsig = lsig;
	}

	public String getLsig(){
		return lsig;
	}

	public void setRating(double rating){
		this.rating = rating;
	}

	public double getRating(){
		return rating;
	}

	public void setPosition(int position){
		this.position = position;
	}

	public int getPosition(){
		return position;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setGpsCoordinates(GpsCoordinates gpsCoordinates){
		this.gpsCoordinates = gpsCoordinates;
	}

	public GpsCoordinates getGpsCoordinates(){
		return gpsCoordinates;
	}

	public void setPlaceId(String placeId){
		this.placeId = placeId;
	}

	public String getPlaceId(){
		return placeId;
	}

	@Override
 	public String toString(){
		return 
			"PlacesItem{" + 
			"place_id_search = '" + placeIdSearch + '\'' + 
			",hours = '" + hours + '\'' + 
			",thumbnail = '" + thumbnail + '\'' + 
			",address = '" + address + '\'' + 
			",reviews = '" + reviews + '\'' + 
			",lsig = '" + lsig + '\'' + 
			",rating = '" + rating + '\'' + 
			",position = '" + position + '\'' + 
			",title = '" + title + '\'' + 
			",type = '" + type + '\'' + 
			",gps_coordinates = '" + gpsCoordinates + '\'' + 
			",place_id = '" + placeId + '\'' + 
			"}";
		}
}