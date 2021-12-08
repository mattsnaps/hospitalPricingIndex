package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SerpapiPagination{

	@JsonProperty("next")
	private String next;

	@JsonProperty("current")
	private int current;

	@JsonProperty("other_pages")
	private OtherPages otherPages;

	@JsonProperty("next_link")
	private String nextLink;

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

	public void setNextLink(String nextLink){
		this.nextLink = nextLink;
	}

	public String getNextLink(){
		return nextLink;
	}

	@Override
 	public String toString(){
		return 
			"SerpapiPagination{" + 
			"next = '" + next + '\'' + 
			",current = '" + current + '\'' + 
			",other_pages = '" + otherPages + '\'' + 
			",next_link = '" + nextLink + '\'' + 
			"}";
		}
}