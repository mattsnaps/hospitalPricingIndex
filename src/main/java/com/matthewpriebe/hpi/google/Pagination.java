package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination{

	@JsonProperty("next")
	private String next;

	@JsonProperty("current")
	private int current;

	@JsonProperty("other_pages")
	private OtherPages otherPages;

	public void setNext(String next){
		this.next = next;
	}

	public String getNext(){
		return next;
	}

	public void setCurrent(int current){
		this.current = current;
	}

	public int getCurrent(){
		return current;
	}

	public void setOtherPages(OtherPages otherPages){
		this.otherPages = otherPages;
	}

	public OtherPages getOtherPages(){
		return otherPages;
	}

	@Override
 	public String toString(){
		return 
			"Pagination{" + 
			"next = '" + next + '\'' + 
			",current = '" + current + '\'' + 
			",other_pages = '" + otherPages + '\'' + 
			"}";
		}
}