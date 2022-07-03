package com.rmt.movieapi.application;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rmt.movieapi.domain.TheaterDetails;
import com.rmt.movieapi.domain.MovieKey;
import com.rmt.movieapi.infrastructure.TheaterRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional
public class TheaterService {

	@PersistenceContext
	private EntityManager manager;
	
	@Autowired
	private TheaterRepository theaterRepository;
	
	public MovieKey create(TheaterDetails theater) {
		TheaterDetails entity = theaterRepository.save(theater);
		if(entity != null) {
			return new MovieKey(entity.getId());
		}
		return null;
	}
	
	public MovieKey update(TheaterDetails movie) {
		TheaterDetails entity = theaterRepository.save(movie);
		if(entity != null) {
			return new MovieKey(entity.getId());
		}
		return null;
	}
	
	public List<TheaterDetails> getAll(){
		return theaterRepository.findAll();
		
	}
	
	public Optional<TheaterDetails> get(long id){
		return theaterRepository.findById(id);
	}

	
	public boolean delete(long id) {
		TheaterDetails entity;
		entity = manager.find(TheaterDetails.class, id);
		if(entity != null) {
			manager.remove(entity);
			return true;
		}
		else {
			System.out.println("Movie record doesn't exist !!!");
			return false;
		}
	}

//	public List<TheaterDetails> findByMovieNameAndCity(String movieName, String cityName) {
//		// TODO Auto-generated method stub
//		return 
//
//	}

//	public List<TheaterDetails> findByMovieName(String movieName) {
//		return theaterRepository.findByMovieName(movieName);
//	}

//	public List<TheaterDetails> findByRating(Long rating) {
//		// TODO Auto-generated method stub
//		return theaterRepository.findBymovieRating(rating);
//	}
}
