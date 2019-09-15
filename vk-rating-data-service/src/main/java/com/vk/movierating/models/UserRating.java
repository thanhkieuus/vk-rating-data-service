package com.vk.movierating.models;

import java.util.List;

import com.vk.movierating.models.Rating;

public class UserRating {
	
	private List<Rating> ratings;

	public UserRating() {}

	public UserRating(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

}
