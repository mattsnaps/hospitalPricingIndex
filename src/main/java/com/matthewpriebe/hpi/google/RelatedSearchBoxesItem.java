package com.matthewpriebe.hpi.google;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RelatedSearchBoxesItem{

	@JsonProperty("query")
	private String query;

	@JsonProperty("position")
	private int position;

	@JsonProperty("results")
	private List<ResultsItem> results;

	public void setQuery(String query){
		this.query = query;
	}

	public String getQuery(){
		return query;
	}

	public void setPosition(int position){
		this.position = position;
	}

	public int getPosition(){
		return position;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"RelatedSearchBoxesItem{" + 
			"query = '" + query + '\'' + 
			",position = '" + position + '\'' + 
			",results = '" + results + '\'' + 
			"}";
		}
}