package com.matthewpriebe.hpi.google;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GoogleResponse{

	@JsonProperty("recipes_results")
	private List<RecipesResultsItem> recipesResults;

	@JsonProperty("pagination")
	private Pagination pagination;

	@JsonProperty("related_questions")
	private List<RelatedQuestionsItem> relatedQuestions;

	@JsonProperty("organic_results")
	private List<OrganicResultsItem> organicResults;

	@JsonProperty("local_map")
	private LocalMap localMap;

	@JsonProperty("related_searches")
	private List<RelatedSearchesItem> relatedSearches;

	@JsonProperty("search_metadata")
	private SearchMetadata searchMetadata;

	@JsonProperty("knowledge_graph")
	private KnowledgeGraph knowledgeGraph;

	@JsonProperty("search_parameters")
	private SearchParameters searchParameters;

	@JsonProperty("local_results")
	private LocalResults localResults;

	@JsonProperty("discover_more_places")
	private List<DiscoverMorePlacesItem> discoverMorePlaces;

	@JsonProperty("related_search_boxes")
	private List<RelatedSearchBoxesItem> relatedSearchBoxes;

	@JsonProperty("search_information")
	private SearchInformation searchInformation;

	@JsonProperty("serpapi_pagination")
	private SerpapiPagination serpapiPagination;

	public void setRecipesResults(List<RecipesResultsItem> recipesResults){
		this.recipesResults = recipesResults;
	}

	public List<RecipesResultsItem> getRecipesResults(){
		return recipesResults;
	}

	public void setPagination(Pagination pagination){
		this.pagination = pagination;
	}

	public Pagination getPagination(){
		return pagination;
	}

	public void setRelatedQuestions(List<RelatedQuestionsItem> relatedQuestions){
		this.relatedQuestions = relatedQuestions;
	}

	public List<RelatedQuestionsItem> getRelatedQuestions(){
		return relatedQuestions;
	}

	public void setOrganicResults(List<OrganicResultsItem> organicResults){
		this.organicResults = organicResults;
	}

	public List<OrganicResultsItem> getOrganicResults(){
		return organicResults;
	}

	public void setLocalMap(LocalMap localMap){
		this.localMap = localMap;
	}

	public LocalMap getLocalMap(){
		return localMap;
	}

	public void setRelatedSearches(List<RelatedSearchesItem> relatedSearches){
		this.relatedSearches = relatedSearches;
	}

	public List<RelatedSearchesItem> getRelatedSearches(){
		return relatedSearches;
	}

	public void setSearchMetadata(SearchMetadata searchMetadata){
		this.searchMetadata = searchMetadata;
	}

	public SearchMetadata getSearchMetadata(){
		return searchMetadata;
	}

	public void setKnowledgeGraph(KnowledgeGraph knowledgeGraph){
		this.knowledgeGraph = knowledgeGraph;
	}

	public KnowledgeGraph getKnowledgeGraph(){
		return knowledgeGraph;
	}

	public void setSearchParameters(SearchParameters searchParameters){
		this.searchParameters = searchParameters;
	}

	public SearchParameters getSearchParameters(){
		return searchParameters;
	}

	public void setLocalResults(LocalResults localResults){
		this.localResults = localResults;
	}

	public LocalResults getLocalResults(){
		return localResults;
	}

	public void setDiscoverMorePlaces(List<DiscoverMorePlacesItem> discoverMorePlaces){
		this.discoverMorePlaces = discoverMorePlaces;
	}

	public List<DiscoverMorePlacesItem> getDiscoverMorePlaces(){
		return discoverMorePlaces;
	}

	public void setRelatedSearchBoxes(List<RelatedSearchBoxesItem> relatedSearchBoxes){
		this.relatedSearchBoxes = relatedSearchBoxes;
	}

	public List<RelatedSearchBoxesItem> getRelatedSearchBoxes(){
		return relatedSearchBoxes;
	}

	public void setSearchInformation(SearchInformation searchInformation){
		this.searchInformation = searchInformation;
	}

	public SearchInformation getSearchInformation(){
		return searchInformation;
	}

	public void setSerpapiPagination(SerpapiPagination serpapiPagination){
		this.serpapiPagination = serpapiPagination;
	}

	public SerpapiPagination getSerpapiPagination(){
		return serpapiPagination;
	}

	@Override
 	public String toString(){
		return 
			"GoogleResponse{" + 
			"recipes_results = '" + recipesResults + '\'' + 
			",pagination = '" + pagination + '\'' + 
			",related_questions = '" + relatedQuestions + '\'' + 
			",organic_results = '" + organicResults + '\'' + 
			",local_map = '" + localMap + '\'' + 
			",related_searches = '" + relatedSearches + '\'' + 
			",search_metadata = '" + searchMetadata + '\'' + 
			",knowledge_graph = '" + knowledgeGraph + '\'' + 
			",search_parameters = '" + searchParameters + '\'' + 
			",local_results = '" + localResults + '\'' + 
			",discover_more_places = '" + discoverMorePlaces + '\'' + 
			",related_search_boxes = '" + relatedSearchBoxes + '\'' + 
			",search_information = '" + searchInformation + '\'' + 
			",serpapi_pagination = '" + serpapiPagination + '\'' + 
			"}";
		}
}