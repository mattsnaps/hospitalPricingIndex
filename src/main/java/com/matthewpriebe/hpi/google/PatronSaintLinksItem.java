package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatronSaintLinksItem{

	@JsonProperty("link")
	private String link;

	@JsonProperty("text")
	private String text;

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	@Override
 	public String toString(){
		return 
			"PatronSaintLinksItem{" + 
			"link = '" + link + '\'' + 
			",text = '" + text + '\'' + 
			"}";
		}
}