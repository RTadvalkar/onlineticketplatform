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
@Table(name = "BOOKING_PLATFORM.SHOW_DETAILS")
@Builder
public class ShowDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "SHOWID")
	private String showid;

	@Column(name = "THEATERID")
	private String theaterid;

	@Column(name = "MOVIEID")
	private String movieid;

	@Column(name = "SHOWTIME")
	private String showtime;
	
	@Column(name = "TOTALSEATS")
	private String totalseats;

	@Column(name = "AVAILABLESEATS")
	private String availableseats;	

	@Column(name = "SHOWPRICE")
	private String showprice;	
	
	@Column(name = "CITYNAME")
	private String cityname;
	
	public ShowDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShowDetails(Long id, String showid, String theaterid, String movieid, String showtime, String totalseats,
			String availableseats, String showprice, String cityname) {
		super();
		this.id = id;
		this.showid = showid;
		this.theaterid = theaterid;
		this.movieid = movieid;
		this.showtime = showtime;
		this.totalseats = totalseats;
		this.availableseats = availableseats;
		this.showprice = showprice;
		this.cityname = cityname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShowid() {
		return showid;
	}

	public void setShowid(String showid) {
		this.showid = showid;
	}

	public String getTheaterid() {
		return theaterid;
	}

	public void setTheaterid(String theaterid) {
		this.theaterid = theaterid;
	}

	public String getMovieid() {
		return movieid;
	}

	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}

	public String getShowtime() {
		return showtime;
	}

	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}

	public String getTotalseats() {
		return totalseats;
	}

	public void setTotalseats(String totalseats) {
		this.totalseats = totalseats;
	}

	public String getAvailableseats() {
		return availableseats;
	}

	public void setAvailableseats(String availableseats) {
		this.availableseats = availableseats;
	}

	public String getShowprice() {
		return showprice;
	}

	public void setShowprice(String showprice) {
		this.showprice = showprice;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

}
