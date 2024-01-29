package com.review.movie.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review.movie.Movie;
import com.review.movie.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	public List<Movie> getAllMovies() {
		System.out.println(movieRepository.findAll());
		return movieRepository.findAll();
	}

	public Optional<Movie> getMovie(String id) {
		return movieRepository.findByImdbId(id);
	}

	
}
