package com.rating.cotroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.model.Rating;
import com.rating.model.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId)
	{
		return new Rating(movieId,"4");
	}
	
	@RequestMapping("users/{userId}")
	public UserRating getUserIdRating(@PathVariable("userId") String userId)
	{
		List<Rating> rating = Arrays.asList(
				new Rating("1234","4"),
				new Rating("5678","4.5")
	             );
		
		UserRating userRating = new UserRating();
		userRating.setUserRating(rating);
		return userRating;
	}
}
