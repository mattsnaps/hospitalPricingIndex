package com.matthewpriebe.hpi.google;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DiscoverMorePlacesItem{

	@JsonProperty("images")
	private List<String> images;

	@JsonProperty("link")
	private String link;

	@JsonProperty("title")
	private String title;

	public void setImages(List<String> images){
		this.images = images;
	}

	public List<String> getImages(){
		return images;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	@Override
 	public String toString(){
		return 
			"DiscoverMorePlacesItem{" + 
			"images = '" + images + '\'' + 
			",link = '" + link + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}