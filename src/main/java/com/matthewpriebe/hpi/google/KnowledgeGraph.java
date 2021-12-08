package com.matthewpriebe.hpi.google;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KnowledgeGraph{

	@JsonProperty("species_of_coffee")
	private List<SpeciesOfCoffeeItem> speciesOfCoffee;

	@JsonProperty("description")
	private String description;

	@JsonProperty("source")
	private Source source;

	@JsonProperty("people_also_search_for_stick")
	private String peopleAlsoSearchForStick;

	@JsonProperty("title")
	private String title;

	@JsonProperty("type")
	private String type;

	@JsonProperty("list")
	private List list;

	@JsonProperty("coffee_books_link")
	private String coffeeBooksLink;

	@JsonProperty("species_of_coffee_stick")
	private String speciesOfCoffeeStick;

	@JsonProperty("coffee_books")
	private List<CoffeeBooksItem> coffeeBooks;

	@JsonProperty("header_images")
	private List<HeaderImagesItem> headerImages;

	@JsonProperty("people_also_search_for_link")
	private String peopleAlsoSearchForLink;

	@JsonProperty("see_results_about")
	private List<SeeResultsAboutItem> seeResultsAbout;

	@JsonProperty("coffee_books_stick")
	private String coffeeBooksStick;

	@JsonProperty("people_also_search_for")
	private List<PeopleAlsoSearchForItem> peopleAlsoSearchFor;

	@JsonProperty("patron_saint_links")
	private List<PatronSaintLinksItem> patronSaintLinks;

	@JsonProperty("species_of_coffee_link")
	private String speciesOfCoffeeLink;

	@JsonProperty("patron_saint")
	private String patronSaint;

	public void setSpeciesOfCoffee(List<SpeciesOfCoffeeItem> speciesOfCoffee){
		this.speciesOfCoffee = speciesOfCoffee;
	}

	public List<SpeciesOfCoffeeItem> getSpeciesOfCoffee(){
		return speciesOfCoffee;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setSource(Source source){
		this.source = source;
	}

	public Source getSource(){
		return source;
	}

	public void setPeopleAlsoSearchForStick(String peopleAlsoSearchForStick){
		this.peopleAlsoSearchForStick = peopleAlsoSearchForStick;
	}

	public String getPeopleAlsoSearchForStick(){
		return peopleAlsoSearchForStick;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setList(List list){
		this.list = list;
	}

	public List getList(){
		return list;
	}

	public void setCoffeeBooksLink(String coffeeBooksLink){
		this.coffeeBooksLink = coffeeBooksLink;
	}

	public String getCoffeeBooksLink(){
		return coffeeBooksLink;
	}

	public void setSpeciesOfCoffeeStick(String speciesOfCoffeeStick){
		this.speciesOfCoffeeStick = speciesOfCoffeeStick;
	}

	public String getSpeciesOfCoffeeStick(){
		return speciesOfCoffeeStick;
	}

	public void setCoffeeBooks(List<CoffeeBooksItem> coffeeBooks){
		this.coffeeBooks = coffeeBooks;
	}

	public List<CoffeeBooksItem> getCoffeeBooks(){
		return coffeeBooks;
	}

	public void setHeaderImages(List<HeaderImagesItem> headerImages){
		this.headerImages = headerImages;
	}

	public List<HeaderImagesItem> getHeaderImages(){
		return headerImages;
	}

	public void setPeopleAlsoSearchForLink(String peopleAlsoSearchForLink){
		this.peopleAlsoSearchForLink = peopleAlsoSearchForLink;
	}

	public String getPeopleAlsoSearchForLink(){
		return peopleAlsoSearchForLink;
	}

	public void setSeeResultsAbout(List<SeeResultsAboutItem> seeResultsAbout){
		this.seeResultsAbout = seeResultsAbout;
	}

	public List<SeeResultsAboutItem> getSeeResultsAbout(){
		return seeResultsAbout;
	}

	public void setCoffeeBooksStick(String coffeeBooksStick){
		this.coffeeBooksStick = coffeeBooksStick;
	}

	public String getCoffeeBooksStick(){
		return coffeeBooksStick;
	}

	public void setPeopleAlsoSearchFor(List<PeopleAlsoSearchForItem> peopleAlsoSearchFor){
		this.peopleAlsoSearchFor = peopleAlsoSearchFor;
	}

	public List<PeopleAlsoSearchForItem> getPeopleAlsoSearchFor(){
		return peopleAlsoSearchFor;
	}

	public void setPatronSaintLinks(List<PatronSaintLinksItem> patronSaintLinks){
		this.patronSaintLinks = patronSaintLinks;
	}

	public List<PatronSaintLinksItem> getPatronSaintLinks(){
		return patronSaintLinks;
	}

	public void setSpeciesOfCoffeeLink(String speciesOfCoffeeLink){
		this.speciesOfCoffeeLink = speciesOfCoffeeLink;
	}

	public String getSpeciesOfCoffeeLink(){
		return speciesOfCoffeeLink;
	}

	public void setPatronSaint(String patronSaint){
		this.patronSaint = patronSaint;
	}

	public String getPatronSaint(){
		return patronSaint;
	}

	@Override
 	public String toString(){
		return 
			"KnowledgeGraph{" + 
			"species_of_coffee = '" + speciesOfCoffee + '\'' + 
			",description = '" + description + '\'' + 
			",source = '" + source + '\'' + 
			",people_also_search_for_stick = '" + peopleAlsoSearchForStick + '\'' + 
			",title = '" + title + '\'' + 
			",type = '" + type + '\'' + 
			",list = '" + list + '\'' + 
			",coffee_books_link = '" + coffeeBooksLink + '\'' + 
			",species_of_coffee_stick = '" + speciesOfCoffeeStick + '\'' + 
			",coffee_books = '" + coffeeBooks + '\'' + 
			",header_images = '" + headerImages + '\'' + 
			",people_also_search_for_link = '" + peopleAlsoSearchForLink + '\'' + 
			",see_results_about = '" + seeResultsAbout + '\'' + 
			",coffee_books_stick = '" + coffeeBooksStick + '\'' + 
			",people_also_search_for = '" + peopleAlsoSearchFor + '\'' + 
			",patron_saint_links = '" + patronSaintLinks + '\'' + 
			",species_of_coffee_link = '" + speciesOfCoffeeLink + '\'' + 
			",patron_saint = '" + patronSaint + '\'' + 
			"}";
		}
}