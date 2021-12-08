package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InlineItem{

	@JsonProperty("link")
	private String link;

	@JsonProperty("title")
	private String title;

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
			"InlineItem{" + 
			"link = '" + link + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}