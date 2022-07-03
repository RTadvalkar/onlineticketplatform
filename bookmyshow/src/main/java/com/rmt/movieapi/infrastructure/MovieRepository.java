package com.rmt.movieapi.infrastructure;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rmt.movieapi.domain.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	List<Movie> findBymovieYear(Long year);
	List<Movie> findBymovieRating(Long rating);
}
