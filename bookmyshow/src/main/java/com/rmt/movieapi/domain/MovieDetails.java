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
@Table(name = "BOOKING_PLATFORM.MOVIE_DETAILS")
@Builder
public class MovieDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "MOVIEID")
	private String movieid;

	@Column(name = "MOVIETITLE")
	private String movietitle;

	@Column(name = "MOVIELANGUAGE")
	private String movielanguage;

	public MovieDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MovieDetails(Long id, String movieid, String movietitle, String movielanguage) {
		super();
		this.id = id;
		this.movieid = movieid;
		this.movietitle = movietitle;
		this.movielanguage = movielanguage;
	}

	public String getMovieid() {
		return movieid;
	}

	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}

	public String getMovietitle() {
		return movietitle;
	}

	public void setMovietitle(String movietitle) {
		this.movietitle = movietitle;
	}

	public String getMovielanguage() {
		return movielanguage;
	}

	public void setMovielanguage(String movielanguage) {
		this.movielanguage = movielanguage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


}
