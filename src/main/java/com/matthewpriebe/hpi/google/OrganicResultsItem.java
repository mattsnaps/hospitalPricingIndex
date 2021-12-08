package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrganicResultsItem{

	@JsonProperty("snippet")
	private String snippet;

	@JsonProperty("about_this_result")
	private AboutThisResult aboutThisResult;

	@JsonProperty("displayed_link")
	private String displayedLink;

	@JsonProperty("link")
	private String link;

	@JsonProperty("cached_page_link")
	private String cachedPageLink;

	@JsonProperty("sitelinks")
	private Sitelinks sitelinks;

	@JsonProperty("position")
	private int position;

	@JsonProperty("title")
	private String title;

	@JsonProperty("related_pages_link")
	private String relatedPagesLink;

	@JsonProperty("rich_snippet")
	private RichSnippet richSnippet;

	public void setSnippet(String snippet){
		this.snippet = snippet;
	}

	public String getSnippet(){
		return snippet;
	}

	public void setAboutThisResult(AboutThisResult aboutThisResult){
		this.aboutThisResult = aboutThisResult;
	}

	public AboutThisResult getAboutThisResult(){
		return aboutThisResult;
	}

	public void setDisplayedLink(String displayedLink){
		this.displayedLink = displayedLink;
	}

	public String getDisplayedLink(){
		return displayedLink;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setCachedPageLink(String cachedPageLink){
		this.cachedPageLink = cachedPageLink;
	}

	public String getCachedPageLink(){
		return cachedPageLink;
	}

	public void setSitelinks(Sitelinks sitelinks){
		this.sitelinks = sitelinks;
	}

	public Sitelinks getSitelinks(){
		return sitelinks;
	}

	public void setPosition(int position){
		this.position = position;
	}

	public int getPosition(){
		return position;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setRelatedPagesLink(String relatedPagesLink){
		this.relatedPagesLink = relatedPagesLink;
	}

	public String getRelatedPagesLink(){
		return relatedPagesLink;
	}

	public void setRichSnippet(RichSnippet richSnippet){
		this.richSnippet = richSnippet;
	}

	public RichSnippet getRichSnippet(){
		return richSnippet;
	}

	@Override
 	public String toString(){
		return 
			"OrganicResultsItem{" + 
			"snippet = '" + snippet + '\'' + 
			",about_this_result = '" + aboutThisResult + '\'' + 
			",displayed_link = '" + displayedLink + '\'' + 
			",link = '" + link + '\'' + 
			",cached_page_link = '" + cachedPageLink + '\'' + 
			",sitelinks = '" + sitelinks + '\'' + 
			",position = '" + position + '\'' + 
			",title = '" + title + '\'' + 
			",related_pages_link = '" + relatedPagesLink + '\'' + 
			",rich_snippet = '" + richSnippet + '\'' + 
			"}";
		}
}