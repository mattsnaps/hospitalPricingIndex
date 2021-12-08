package com.matthewpriebe.hpi.google;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AboutThisResult{

	@JsonProperty("regions")
	private List<String> regions;

	@JsonProperty("keywords")
	private List<String> keywords;

	@JsonProperty("languages")
	private List<String> languages;

	@JsonProperty("related_keywords")
	private List<String> relatedKeywords;

	@JsonProperty("source")
	private Source source;

	public void setRegions(List<String> regions){
		this.regions = regions;
	}

	public List<String> getRegions(){
		return regions;
	}

	public void setKeywords(List<String> keywords){
		this.keywords = keywords;
	}

	public List<String> getKeywords(){
		return keywords;
	}

	public void setLanguages(List<String> languages){
		this.languages = languages;
	}

	public List<String> getLanguages(){
		return languages;
	}

	public void setRelatedKeywords(List<String> relatedKeywords){
		this.relatedKeywords = relatedKeywords;
	}

	public List<String> getRelatedKeywords(){
		return relatedKeywords;
	}

	public void setSource(Source source){
		this.source = source;
	}

	public Source getSource(){
		return source;
	}

	@Override
 	public String toString(){
		return 
			"AboutThisResult{" + 
			"regions = '" + regions + '\'' + 
			",keywords = '" + keywords + '\'' + 
			",languages = '" + languages + '\'' + 
			",related_keywords = '" + relatedKeywords + '\'' + 
			",source = '" + source + '\'' + 
			"}";
		}
}