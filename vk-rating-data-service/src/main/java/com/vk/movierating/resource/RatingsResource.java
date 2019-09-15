package com.vk.movierating.resource;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vk.movierating.models.Rating;
import com.vk.movierating.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
	
	private static final Logger logger = LoggerFactory.getLogger(RatingsResource.class);
	
	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		
		return new Rating(movieId, 4);
		
	}	
	
	@GetMapping("/users/{userId}")
	public UserRating getUserReating(@PathVariable("userId") String userId) {

		logger.info("userId: {}", userId);
		
		// Hard codes here for testing
		List<Rating> ratings = Arrays.asList(
				new Rating("500", 4),
				new Rating("501", 3)
				);	
		
		return new UserRating(ratings);
	
	}
}
