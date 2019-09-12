package com.vk.movierating.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vk.movierating.models.Rating;
import com.vk.movierating.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
	
	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		
		return new Rating(movieId, 4);
		
	}	
	
	@GetMapping("/users/{userId}")
	public UserRating getUserReating(@PathVariable("userId") String userId) {
		
		// Hard codes here for testing
		List<Rating> ratings = Arrays.asList(
				new Rating("1234", 4),
				new Rating("3456", 3)
				);	
		
		return new UserRating(ratings);
	
	}
}
