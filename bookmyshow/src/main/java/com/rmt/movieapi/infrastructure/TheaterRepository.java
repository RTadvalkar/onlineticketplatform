package com.rmt.movieapi.infrastructure;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rmt.movieapi.domain.TheaterDetails;

public interface TheaterRepository extends JpaRepository<TheaterDetails, Long> {

//	List<TheaterDetails> findByMovieName(String movieName);

//	List<TheaterDetails> findBymovieYear(Long year);
//	List<TheaterDetails> findBymovieRating(Long rating);
}
