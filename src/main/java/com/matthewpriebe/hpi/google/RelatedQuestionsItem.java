package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RelatedQuestionsItem{

	@JsonProperty("snippet")
	private String snippet;

	@JsonProperty("displayed_link")
	private String displayedLink;

	@JsonProperty("question")
	private String question;

	@JsonProperty("link")
	private String link;

	@JsonProperty("title")
	private String title;

	public void setSnippet(String snippet){
		this.snippet = snippet;
	}

	public String getSnippet(){
		return snippet;
	}

	public void setDisplayedLink(String displayedLink){
		this.displayedLink = displayedLink;
	}

	public String getDisplayedLink(){
		return displayedLink;
	}

	public void setQuestion(String question){
		this.question = question;
	}

	public String getQuestion(){
		return question;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	@Override
 	public String toString(){
		return 
			"RelatedQuestionsItem{" + 
			"snippet = '" + snippet + '\'' + 
			",displayed_link = '" + displayedLink + '\'' + 
			",question = '" + question + '\'' + 
			",link = '" + link + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}