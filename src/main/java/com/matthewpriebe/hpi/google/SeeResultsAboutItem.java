package com.matthewpriebe.hpi.google;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SeeResultsAboutItem{

	@JsonProperty("image")
	private String image;

	@JsonProperty("extensions")
	private List<String> extensions;

	@JsonProperty("name")
	private String name;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setExtensions(List<String> extensions){
		this.extensions = extensions;
	}

	public List<String> getExtensions(){
		return extensions;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"SeeResultsAboutItem{" + 
			"image = '" + image + '\'' + 
			",extensions = '" + extensions + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}