package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchMetadata{

	@JsonProperty("raw_html_file")
	private String rawHtmlFile;

	@JsonProperty("created_at")
	private String createdAt;

	@JsonProperty("processed_at")
	private String processedAt;

	@JsonProperty("id")
	private String id;

	@JsonProperty("total_time_taken")
	private double totalTimeTaken;

	@JsonProperty("google_url")
	private String googleUrl;

	@JsonProperty("json_endpoint")
	private String jsonEndpoint;

	@JsonProperty("status")
	private String status;

	public void setRawHtmlFile(String rawHtmlFile){
		this.rawHtmlFile = rawHtmlFile;
	}

	public String getRawHtmlFile(){
		return rawHtmlFile;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setProcessedAt(String processedAt){
		this.processedAt = processedAt;
	}

	public String getProcessedAt(){
		return processedAt;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setTotalTimeTaken(double totalTimeTaken){
		this.totalTimeTaken = totalTimeTaken;
	}

	public double getTotalTimeTaken(){
		return totalTimeTaken;
	}

	public void setGoogleUrl(String googleUrl){
		this.googleUrl = googleUrl;
	}

	public String getGoogleUrl(){
		return googleUrl;
	}

	public void setJsonEndpoint(String jsonEndpoint){
		this.jsonEndpoint = jsonEndpoint;
	}

	public String getJsonEndpoint(){
		return jsonEndpoint;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"SearchMetadata{" + 
			"raw_html_file = '" + rawHtmlFile + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",processed_at = '" + processedAt + '\'' + 
			",id = '" + id + '\'' + 
			",total_time_taken = '" + totalTimeTaken + '\'' + 
			",google_url = '" + googleUrl + '\'' + 
			",json_endpoint = '" + jsonEndpoint + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}