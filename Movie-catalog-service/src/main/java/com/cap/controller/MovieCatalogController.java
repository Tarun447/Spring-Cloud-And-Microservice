package com.cap.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.cap.model.CatalogItem;
import com.cap.model.Movie;
import com.cap.model.Rating;
import com.cap.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClintBuilder;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
	{
		
		
	
		UserRating rating = restTemplate.getForObject("http://localhost:8083/rating/users/"+userId, UserRating.class);
		
		
		return rating.getUserRating().stream().map(ratings->
		{
			Movie movie = restTemplate.getForObject("http://localhost:8089/movie/"+ratings.getMovieId(),Movie.class);
			
//			Movie movie=webClintBuilder.build()
//			.get()
//			.uri("http://localhost:8089/movie/"+ratings.getMovieId())
//			.retrieve().bodyToMono(Movie.class).block();
			
			return new CatalogItem(movie.getName(),"Educational",ratings.getRating());}).collect(Collectors.toList());
		
	}
}
