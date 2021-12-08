package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeaderImagesItem{

	@JsonProperty("image")
	private String image;

	@JsonProperty("source")
	private String source;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setSource(String source){
		this.source = source;
	}

	public String getSource(){
		return source;
	}

	@Override
 	public String toString(){
		return 
			"HeaderImagesItem{" + 
			"image = '" + image + '\'' + 
			",source = '" + source + '\'' + 
			"}";
		}
}