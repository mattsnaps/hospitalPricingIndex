package com.matthewpriebe.hpi.google;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LocalResults{

	@JsonProperty("places")
	private List<PlacesItem> places;

	@JsonProperty("more_locations_link")
	private String moreLocationsLink;

	public void setPlaces(List<PlacesItem> places){
		this.places = places;
	}

	public List<PlacesItem> getPlaces(){
		return places;
	}

	public void setMoreLocationsLink(String moreLocationsLink){
		this.moreLocationsLink = moreLocationsLink;
	}

	public String getMoreLocationsLink(){
		return moreLocationsLink;
	}

	@Override
 	public String toString(){
		return 
			"LocalResults{" + 
			"places = '" + places + '\'' + 
			",more_locations_link = '" + moreLocationsLink + '\'' + 
			"}";
		}
}