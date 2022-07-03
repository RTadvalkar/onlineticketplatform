package com.rmt.movieapi.application;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rmt.movieapi.domain.Movie;
import com.rmt.movieapi.domain.MovieKey;
import com.rmt.movieapi.infrastructure.MovieRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional
public class MovieService {

	@PersistenceContext
	private EntityManager manager;
	
	@Autowired
	private MovieRepository movieRepository;
	
	public MovieKey create(Movie movie) {
		Movie entity = movieRepository.save(movie);
		if(entity != null) {
			return new MovieKey(entity.getId());
		}
		return null;
	}
	
	public MovieKey update(Movie movie) {
		Movie entity = movieRepository.save(movie);
		if(entity != null) {
			return new MovieKey(entity.getId());
		}
		return null;
	}
	
	public List<Movie> getAll(){
		return movieRepository.findAll();
		
	}
	
	public Optional<Movie> get(long id){
		return movieRepository.findById(id);
	}
	
	public List<Movie> findByYear(long year){
		return movieRepository.findBymovieYear(year);
	}
	
	public boolean delete(long id) {
		Movie entity;
		entity = manager.find(Movie.class, id);
		if(entity != null) {
			manager.remove(entity);
			return true;
		}
		else {
			System.out.println("Movie record doesn't exist !!!");
			return false;
		}
	}

	public List<Movie> findByRating(Long rating) {
		// TODO Auto-generated method stub
		return movieRepository.findBymovieRating(rating);
	}
}
