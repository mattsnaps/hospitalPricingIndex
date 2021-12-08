package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RichSnippet{

	@JsonProperty("bottom")
	private Bottom bottom;

	public void setBottom(Bottom bottom){
		this.bottom = bottom;
	}

	public Bottom getBottom(){
		return bottom;
	}

	@Override
 	public String toString(){
		return 
			"RichSnippet{" + 
			"bottom = '" + bottom + '\'' + 
			"}";
		}
}