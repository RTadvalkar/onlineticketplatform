package com.rmt.movieapi.application.model;

import java.io.Serializable;

public class MovieDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8203725914002872579L;

	private String movieName;
	private Long movieYear;
	private Long movieRating;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Long getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(Long movieYear) {
		this.movieYear = movieYear;
	}

	public Long getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(Long movieRating) {
		this.movieRating = movieRating;
	}
}
