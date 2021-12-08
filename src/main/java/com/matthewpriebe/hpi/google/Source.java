package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Source{

	@JsonProperty("name")
	private String name;

	@JsonProperty("link")
	private String link;

	@JsonProperty("security")
	private String security;

	@JsonProperty("source_info_link")
	private String sourceInfoLink;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("description")
	private String description;

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

	public void setSecurity(String security){
		this.security = security;
	}

	public String getSecurity(){
		return security;
	}

	public void setSourceInfoLink(String sourceInfoLink){
		this.sourceInfoLink = sourceInfoLink;
	}

	public String getSourceInfoLink(){
		return sourceInfoLink;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

	public String getIcon(){
		return icon;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	@Override
 	public String toString(){
		return 
			"Source{" + 
			"name = '" + name + '\'' + 
			",link = '" + link + '\'' + 
			",security = '" + security + '\'' + 
			",source_info_link = '" + sourceInfoLink + '\'' + 
			",icon = '" + icon + '\'' + 
			",description = '" + description + '\'' + 
			"}";
		}
}