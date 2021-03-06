package com.muvit.passenger.Models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Getnotification{

	@SerializedName("totalRecords")
	@Expose
	private int totalRecords;

	@SerializedName("dataAns")
	@Expose
	private List<Notification> dataAns;

	@SerializedName("message")
	@Expose
	private String message;

	@SerializedName("status")
	@Expose
	private boolean status;

	public int getTotalRecords(){
		return totalRecords;
	}

	public List<Notification> getDataAns(){
		return dataAns;
	}

	public String getMessage(){
		return message;
	}

	public boolean isStatus(){
		return status;
	}
}