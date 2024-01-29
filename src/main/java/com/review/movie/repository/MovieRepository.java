package com.review.movie.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.review.movie.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
	
	public Optional<Movie> findByImdbId(String imdbId);

}
