package com.review.movie;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.review.movie.service.MovieService;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "*")
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@GetMapping("/allMovies")
	@CrossOrigin
    public ResponseEntity<List<Movie>> getMovies() {
		System.out.println(movieService.getAllMovies());
        return new ResponseEntity<List<Movie>>(movieService.getAllMovies(), HttpStatus.OK);
    }
	
	@GetMapping("/{id}")
	@CrossOrigin
	public ResponseEntity<Optional<Movie>> getMovie(@PathVariable String id){
        return new ResponseEntity<Optional<Movie>>(movieService.getMovie(id), HttpStatus.OK);
 
	}
}
