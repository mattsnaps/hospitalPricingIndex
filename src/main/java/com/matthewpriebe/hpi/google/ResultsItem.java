package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultsItem{

	@JsonProperty("snippet")
	private String snippet;

	@JsonProperty("thumbnail")
	private String thumbnail;

	@JsonProperty("link")
	private String link;

	@JsonProperty("title")
	private String title;

	public void setSnippet(String snippet){
		this.snippet = snippet;
	}

	public String getSnippet(){
		return snippet;
	}

	public void setThumbnail(String thumbnail){
		this.thumbnail = thumbnail;
	}

	public String getThumbnail(){
		return thumbnail;
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
			"ResultsItem{" + 
			"snippet = '" + snippet + '\'' + 
			",thumbnail = '" + thumbnail + '\'' + 
			",link = '" + link + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}