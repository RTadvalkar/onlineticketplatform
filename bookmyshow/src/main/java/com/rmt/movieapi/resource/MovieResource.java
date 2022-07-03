package com.rmt.movieapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rmt.movieapi.application.MovieService;
import com.rmt.movieapi.domain.Movie;
import com.rmt.movieapi.domain.MovieKey;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/movies")
public class MovieResource {
	
	@Autowired
	private MovieService movieService;
	
	@PostMapping(path="/add")
	public ResponseEntity<?> createMovie(@RequestBody Movie movie){
		MovieKey key = movieService.create(movie);
		if(key != null) {
			return new ResponseEntity<String>("New Record has been added !!!",HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>("Error while creating new record !!!",HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping(path="/modify")
	public ResponseEntity<?> updateMovie(@RequestBody Movie movie){
		MovieKey key = movieService.update(movie);
		if(key != null) {
			return new ResponseEntity<String>("Updation of Record successful !!!",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Error while updating new record !!!",HttpStatus.BAD_REQUEST);
		}
	}	
	
	@GetMapping(path="/listall")
	public List<Movie> getAllMovie(){
		return movieService.getAll();
	}
	
	@GetMapping(path="/findbyyear")
	public List<Movie> getMovieByYear(@RequestParam("year") Long year){
		System.out.println("Year is : "+year);
		return movieService.findByYear(year);
	}

	@GetMapping(path="/findbyrating")
	public List<Movie> getMovieByRating(@RequestParam("rating") Long rating){
		return movieService.findByRating(rating);
	}
	
	@DeleteMapping(path="/delete")
	public ResponseEntity<?> deleteMovie(@RequestBody Movie movie){
		boolean key = movieService.delete(movie.getId());
		if(key != false) {
			return new ResponseEntity<String>("deletion of details is successful !!!", HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No records to delete !!!", HttpStatus.OK);
			
		}
	}
}
