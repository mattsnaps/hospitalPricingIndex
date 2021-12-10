package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchInformation{

	@JsonProperty("query_displayed")
	private String queryDisplayed;

	@JsonProperty("time_taken_displayed")
	private double timeTakenDisplayed;

	@JsonProperty("organic_results_state")
	private String organicResultsState;

	@JsonProperty("total_results")
	private long totalResults;

	public void setQueryDisplayed(String queryDisplayed){
		this.queryDisplayed = queryDisplayed;
	}

	public String getQueryDisplayed(){
		return queryDisplayed;
	}

	public void setTimeTakenDisplayed(double timeTakenDisplayed){
		this.timeTakenDisplayed = timeTakenDisplayed;
	}

	public double getTimeTakenDisplayed(){
		return timeTakenDisplayed;
	}

	public void setOrganicResultsState(String organicResultsState){
		this.organicResultsState = organicResultsState;
	}

	public String getOrganicResultsState(){
		return organicResultsState;
	}

	public void setTotalResults(long totalResults){
		this.totalResults = totalResults;
	}

	public long getTotalResults(){
		return totalResults;
	}

	@Override
 	public String toString(){
		return 
			"SearchInformation{" + 
			"query_displayed = '" + queryDisplayed + '\'' + 
			",time_taken_displayed = '" + timeTakenDisplayed + '\'' + 
			",organic_results_state = '" + organicResultsState + '\'' + 
			",total_results = '" + totalResults + '\'' + 
			"}";
		}
}