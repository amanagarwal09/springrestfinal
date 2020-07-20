package com.cognizant.moviecruiser.dao;

import java.util.List;

import com.cognizant.moviecruiser.exception.MovieNotFoundException;
import com.cognizant.moviecruiser.model.Movie;

public interface MovieDao 
{
	public List<Movie> getMovieListCustomer();
	public void modifyMovie(Movie movie) throws MovieNotFoundException;
	public Movie getMovie(long movieId) throws MovieNotFoundException;
}
