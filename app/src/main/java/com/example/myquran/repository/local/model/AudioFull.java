package com.example.myquran.repository.local.model;

import com.google.gson.annotations.SerializedName;

public class AudioFull{

	@SerializedName("01")
	private String jsonMember01;

	@SerializedName("02")
	private String jsonMember02;

	@SerializedName("03")
	private String jsonMember03;

	@SerializedName("04")
	private String jsonMember04;

	@SerializedName("05")
	private String jsonMember05;

	public String getJsonMember01(){
		return jsonMember01;
	}

	public String getJsonMember02(){
		return jsonMember02;
	}

	public String getJsonMember03(){
		return jsonMember03;
	}

	public String getJsonMember04(){
		return jsonMember04;
	}

	public String getJsonMember05(){
		return jsonMember05;
	}
}