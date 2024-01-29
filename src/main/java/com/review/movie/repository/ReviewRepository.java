package com.review.movie.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.review.movie.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
