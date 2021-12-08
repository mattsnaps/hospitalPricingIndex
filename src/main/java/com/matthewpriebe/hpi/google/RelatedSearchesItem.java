package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RelatedSearchesItem{

	@JsonProperty("query")
	private String query;

	@JsonProperty("link")
	private String link;

	public void setQuery(String query){
		this.query = query;
	}

	public String getQuery(){
		return query;
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
			"RelatedSearchesItem{" + 
			"query = '" + query + '\'' + 
			",link = '" + link + '\'' + 
			"}";
		}
}