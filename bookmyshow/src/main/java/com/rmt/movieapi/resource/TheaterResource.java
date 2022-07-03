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

import com.rmt.movieapi.application.ShowsService;
import com.rmt.movieapi.application.TheaterService;
import com.rmt.movieapi.domain.TheaterDetails;
import com.rmt.movieapi.infrastructure.ShowsRepository;
import com.rmt.movieapi.domain.MovieKey;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/theaterservice")
public class TheaterResource {
	
	@Autowired
	private TheaterService theaterService;
	
	@Autowired
	private ShowsService showService;

	
	@PostMapping(path="/add")
	public ResponseEntity<?> createMovie(@RequestBody TheaterDetails theater){
		MovieKey key = theaterService.create(theater);
		if(key != null) {
			return new ResponseEntity<String>("New Record has been added !!!",HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>("Error while creating new record !!!",HttpStatus.BAD_REQUEST);
		}
	}

//	@PostMapping(path="/modify")
//	public ResponseEntity<?> updateMovie(@RequestBody TheaterDetails theater){
//		MovieKey key = theaterService.update(theater);
//		if(key != null) {
//			return new ResponseEntity<String>("Updation of Record successful !!!",HttpStatus.OK);
//		}
//		else {
//			return new ResponseEntity<String>("Error while updating new record !!!",HttpStatus.BAD_REQUEST);
//		}
//	}	
//	
	@GetMapping(path="/listall")
	public List<TheaterDetails> getAllTheaters(){
		return theaterService.getAll();
	}
//	
	@GetMapping(path="/findbymovieandcity")
	public List<TheaterDetails> getMovieByYear(@RequestParam("movieName") String movieName,@RequestParam String cityName){
		return showService.findByMovieNameAndCity(movieName, cityName);
	}
//
//	@GetMapping(path="/findbyrating")
//	public List<TheaterDetails> getMovieByRating(@RequestParam("rating") Long rating){
//		return theaterService.findByRating(rating);
//	}
//	
//	@DeleteMapping(path="/delete")
//	public ResponseEntity<?> deleteMovie(@RequestBody TheaterDetails theater){
//		boolean key = theaterService.delete(theater.getId());
//		if(key != false) {
//			return new ResponseEntity<String>("deletion of details is successful !!!", HttpStatus.OK);
//		}
//		else {
//			return new ResponseEntity<String>("No records to delete !!!", HttpStatus.OK);
//			
//		}
//	}
}
