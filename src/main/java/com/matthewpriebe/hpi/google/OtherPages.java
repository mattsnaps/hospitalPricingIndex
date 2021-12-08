package com.matthewpriebe.hpi.google;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OtherPages{

	@JsonProperty("2")
	private String jsonMember2;

	@JsonProperty("3")
	private String jsonMember3;

	@JsonProperty("4")
	private String jsonMember4;

	@JsonProperty("5")
	private String jsonMember5;

	@JsonProperty("6")
	private String jsonMember6;

	@JsonProperty("7")
	private String jsonMember7;

	@JsonProperty("8")
	private String jsonMember8;

	@JsonProperty("9")
	private String jsonMember9;

	@JsonProperty("10")
	private String jsonMember10;

	public void setJsonMember2(String jsonMember2){
		this.jsonMember2 = jsonMember2;
	}

	public String getJsonMember2(){
		return jsonMember2;
	}

	public void setJsonMember3(String jsonMember3){
		this.jsonMember3 = jsonMember3;
	}

	public String getJsonMember3(){
		return jsonMember3;
	}

	public void setJsonMember4(String jsonMember4){
		this.jsonMember4 = jsonMember4;
	}

	public String getJsonMember4(){
		return jsonMember4;
	}

	public void setJsonMember5(String jsonMember5){
		this.jsonMember5 = jsonMember5;
	}

	public String getJsonMember5(){
		return jsonMember5;
	}

	public void setJsonMember6(String jsonMember6){
		this.jsonMember6 = jsonMember6;
	}

	public String getJsonMember6(){
		return jsonMember6;
	}

	public void setJsonMember7(String jsonMember7){
		this.jsonMember7 = jsonMember7;
	}

	public String getJsonMember7(){
		return jsonMember7;
	}

	public void setJsonMember8(String jsonMember8){
		this.jsonMember8 = jsonMember8;
	}

	public String getJsonMember8(){
		return jsonMember8;
	}

	public void setJsonMember9(String jsonMember9){
		this.jsonMember9 = jsonMember9;
	}

	public String getJsonMember9(){
		return jsonMember9;
	}

	public void setJsonMember10(String jsonMember10){
		this.jsonMember10 = jsonMember10;
	}

	public String getJsonMember10(){
		return jsonMember10;
	}

	@Override
 	public String toString(){
		return 
			"OtherPages{" + 
			"2 = '" + jsonMember2 + '\'' + 
			",3 = '" + jsonMember3 + '\'' + 
			",4 = '" + jsonMember4 + '\'' + 
			",5 = '" + jsonMember5 + '\'' + 
			",6 = '" + jsonMember6 + '\'' + 
			",7 = '" + jsonMember7 + '\'' + 
			",8 = '" + jsonMember8 + '\'' + 
			",9 = '" + jsonMember9 + '\'' + 
			",10 = '" + jsonMember10 + '\'' + 
			"}";
		}
}