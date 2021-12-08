package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetectedExtensions{

	@JsonProperty("introduced_th_century")
	private int introducedThCentury;

	public void setIntroducedThCentury(int introducedThCentury){
		this.introducedThCentury = introducedThCentury;
	}

	public int getIntroducedThCentury(){
		return introducedThCentury;
	}

	@Override
 	public String toString(){
		return 
			"DetectedExtensions{" + 
			"introduced_th_century = '" + introducedThCentury + '\'' + 
			"}";
		}
}