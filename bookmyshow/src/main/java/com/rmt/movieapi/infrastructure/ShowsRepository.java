package com.rmt.movieapi.infrastructure;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rmt.movieapi.domain.ShowDetails;
import com.rmt.movieapi.domain.TheaterDetails;

public interface ShowsRepository extends JpaRepository<ShowDetails, Long> {

	List<ShowDetails> findByMovieNameAndCity(String movieName, String cityName);

//	List<TheaterDetails> findByMovieName(String movieName);

//	List<TheaterDetails> findBymovieYear(Long year);
//	List<TheaterDetails> findBymovieRating(Long rating);
}
