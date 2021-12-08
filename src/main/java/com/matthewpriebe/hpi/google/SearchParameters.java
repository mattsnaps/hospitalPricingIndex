package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchParameters{

	@JsonProperty("location_requested")
	private String locationRequested;

	@JsonProperty("q")
	private String Q;

	@JsonProperty("hl")
	private String hl;

	@JsonProperty("engine")
	private String engine;

	@JsonProperty("gl")
	private String gl;

	@JsonProperty("google_domain")
	private String googleDomain;

	@JsonProperty("num")
	private String num;

	@JsonProperty("location_used")
	private String locationUsed;

	@JsonProperty("device")
	private String device;

	public void setLocationRequested(String locationRequested){
		this.locationRequested = locationRequested;
	}

	public String getLocationRequested(){
		return locationRequested;
	}

	public void setQ(String Q){
		this.Q = Q;
	}

	public String getQ(){
		return Q;
	}

	public void setHl(String hl){
		this.hl = hl;
	}

	public String getHl(){
		return hl;
	}

	public void setEngine(String engine){
		this.engine = engine;
	}

	public String getEngine(){
		return engine;
	}

	public void setGl(String gl){
		this.gl = gl;
	}

	public String getGl(){
		return gl;
	}

	public void setGoogleDomain(String googleDomain){
		this.googleDomain = googleDomain;
	}

	public String getGoogleDomain(){
		return googleDomain;
	}

	public void setNum(String num){
		this.num = num;
	}

	public String getNum(){
		return num;
	}

	public void setLocationUsed(String locationUsed){
		this.locationUsed = locationUsed;
	}

	public String getLocationUsed(){
		return locationUsed;
	}

	public void setDevice(String device){
		this.device = device;
	}

	public String getDevice(){
		return device;
	}

	@Override
 	public String toString(){
		return 
			"SearchParameters{" + 
			"location_requested = '" + locationRequested + '\'' + 
			",q = '" + Q + '\'' + 
			",hl = '" + hl + '\'' + 
			",engine = '" + engine + '\'' + 
			",gl = '" + gl + '\'' + 
			",google_domain = '" + googleDomain + '\'' + 
			",num = '" + num + '\'' + 
			",location_used = '" + locationUsed + '\'' + 
			",device = '" + device + '\'' + 
			"}";
		}
}