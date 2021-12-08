package com.matthewpriebe.hpi.google;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RecipesResultsItem{

	@JsonProperty("thumbnail")
	private String thumbnail;

	@JsonProperty("link")
	private String link;

	@JsonProperty("ingredients")
	private List<String> ingredients;

	@JsonProperty("source")
	private String source;

	@JsonProperty("title")
	private String title;

	@JsonProperty("total_time")
	private String totalTime;

	@JsonProperty("reviews")
	private int reviews;

	@JsonProperty("rating")
	private double rating;

	public void setThumbnail(String thumbnail){
		this.thumbnail = thumbnail;
	}

	public String getThumbnail(){
		return thumbnail;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setIngredients(List<String> ingredients){
		this.ingredients = ingredients;
	}

	public List<String> getIngredients(){
		return ingredients;
	}

	public void setSource(String source){
		this.source = source;
	}

	public String getSource(){
		return source;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setTotalTime(String totalTime){
		this.totalTime = totalTime;
	}

	public String getTotalTime(){
		return totalTime;
	}

	public void setReviews(int reviews){
		this.reviews = reviews;
	}

	public int getReviews(){
		return reviews;
	}

	public void setRating(double rating){
		this.rating = rating;
	}

	public double getRating(){
		return rating;
	}

	@Override
 	public String toString(){
		return 
			"RecipesResultsItem{" + 
			"thumbnail = '" + thumbnail + '\'' + 
			",link = '" + link + '\'' + 
			",ingredients = '" + ingredients + '\'' + 
			",source = '" + source + '\'' + 
			",title = '" + title + '\'' + 
			",total_time = '" + totalTime + '\'' + 
			",reviews = '" + reviews + '\'' + 
			",rating = '" + rating + '\'' + 
			"}";
		}
}