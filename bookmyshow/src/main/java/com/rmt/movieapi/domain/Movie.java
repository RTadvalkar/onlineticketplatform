package com.rmt.movieapi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;

@Entity
@Table(name = "MOVIE")
@Builder
public class Movie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "MOVIENAME")
	private String movieName;

	@Column(name = "MOVIEYEAR")
	private Long movieYear;

	@Column(name = "MOVIERATING")
	private Long movieRating;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(Long id, String movieName, Long movieYear, Long movieRating) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieYear = movieYear;
		this.movieRating = movieRating;
	}

	public Long getId() {
		return this.id;
	}

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
