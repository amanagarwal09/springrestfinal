package com.cognizant.moviecruiser.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.moviecruiser.exception.MovieNotFoundException;
import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.service.FavouritesService;

@RestController
@RequestMapping("/favourites")
public class FavouritesController 
{
	private static Logger LOGGER=LoggerFactory.getLogger(FavouritesController.class);
	
	@Autowired
	private FavouritesService favouritesService;
	
	@PostMapping("/{userId}/{movieId}")
	public void addToFavourites(@PathVariable String userId, @PathVariable long movieId) throws MovieNotFoundException {
		LOGGER.info("START:FavouritesController addToFavourites()");
		favouritesService.addToFavourites(userId, movieId);
		LOGGER.info("END:FavouritesController addToFavourites()");
	}
	
	@GetMapping("/{userId}")
	public List<Movie> getAllFavouritesMovies(@PathVariable String userId) {
		LOGGER.info("START:FavouritesController getAllFavouritesMovies()");
		LOGGER.info("END:FavouritesController getAllFavouritesMovies()");
		return favouritesService.getAllFavouritesMovies(userId);
	}
	
	@DeleteMapping("/{userId}/{movieId}")
	public void removeFromFavourites(@PathVariable String userId, @PathVariable long movieId) throws MovieNotFoundException {
		LOGGER.info("START:FavouritesController removeFromFavourites()");
		favouritesService.removeFromFavourites(userId, movieId);
		LOGGER.info("END:FavouritesController removeFromFavourites()");
	}
	
	@GetMapping("/favlist/{userId}")
	public long gettotalFavourites(@PathVariable String userId) {
		LOGGER.info("START:FavouritesController gettotalFavourites()");
		LOGGER.info("END:FavouritesController gettotalFavourites()");
		return favouritesService.gettotalFavourites(userId);
	}
}
