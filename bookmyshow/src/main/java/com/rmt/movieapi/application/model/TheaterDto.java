package com.rmt.movieapi.application.model;

import java.io.Serializable;

public class TheaterDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8203725914002872579L;

	public Long getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(Long theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getTheaterCity() {
		return theaterCity;
	}
	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}
	
	private Long theaterId;
	private String theaterName;
	private String theaterCity;
	
}
