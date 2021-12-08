package com.matthewpriebe.hpi.google;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Sitelinks{

	@JsonProperty("inline")
	private List<InlineItem> inline;

	public void setInline(List<InlineItem> inline){
		this.inline = inline;
	}

	public List<InlineItem> getInline(){
		return inline;
	}

	@Override
 	public String toString(){
		return 
			"Sitelinks{" + 
			"inline = '" + inline + '\'' + 
			"}";
		}
}