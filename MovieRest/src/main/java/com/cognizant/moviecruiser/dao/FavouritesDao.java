package com.cognizant.moviecruiser.dao;

import java.util.List;

import com.cognizant.moviecruiser.exception.MovieNotFoundException;
import com.cognizant.moviecruiser.model.Movie;

public interface FavouritesDao 
{
	public void addToFavourites(String userid, long movieId) throws MovieNotFoundException;
	
	public List<Movie> getAllFavouritesMovies(String userid);
	
	public void removeFromFavourites(String userid, long movieId) throws MovieNotFoundException;
	
	public long gettotalFavourites(String userid);
	
}
