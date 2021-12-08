package com.matthewpriebe.hpi.google;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Bottom{

	@JsonProperty("extensions")
	private List<String> extensions;

	@JsonProperty("detected_extensions")
	private DetectedExtensions detectedExtensions;

	public void setExtensions(List<String> extensions){
		this.extensions = extensions;
	}

	public List<String> getExtensions(){
		return extensions;
	}

	public void setDetectedExtensions(DetectedExtensions detectedExtensions){
		this.detectedExtensions = detectedExtensions;
	}

	public DetectedExtensions getDetectedExtensions(){
		return detectedExtensions;
	}

	@Override
 	public String toString(){
		return 
			"Bottom{" + 
			"extensions = '" + extensions + '\'' + 
			",detected_extensions = '" + detectedExtensions + '\'' + 
			"}";
		}
}