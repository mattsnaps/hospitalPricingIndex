package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpeciesOfCoffeeItem{

	@JsonProperty("image")
	private String image;

	@JsonProperty("name")
	private String name;

	@JsonProperty("link")
	private String link;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	@Override
 	public String toString(){
		return 
			"SpeciesOfCoffeeItem{" + 
			"image = '" + image + '\'' + 
			",name = '" + name + '\'' + 
			",link = '" + link + '\'' + 
			"}";
		}
}