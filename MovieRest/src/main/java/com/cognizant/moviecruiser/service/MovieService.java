package com.cognizant.moviecruiser.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.dao.MovieDao;
import com.cognizant.moviecruiser.dao.MovieDaoCollectionImpl;
import com.cognizant.moviecruiser.exception.MovieNotFoundException;
import com.cognizant.moviecruiser.model.Movie;

@Service
public class MovieService 
{
	private static Logger LOGGER=LoggerFactory.getLogger(MovieService.class);
	
	@Autowired
	private MovieDao movieDao; 
	

	public List<Movie> getMovieListCustomer(){
		LOGGER.info("START:MovieService getMovieListCustomer()");
		LOGGER.info("END:MovieService getMovieListCustomer()");
		return movieDao.getMovieListCustomer();
	}

	public void modifyMovie(Movie movie) throws MovieNotFoundException {
		LOGGER.info("START:MovieService modifyMovie()");
		movieDao.modifyMovie(movie);
		LOGGER.info("END:MovieService modifyMovie()");
	}

	public Movie getMovie(long movieId) throws MovieNotFoundException {
		LOGGER.info("START:MovieService getMovie()");
		LOGGER.info("END:MovieService getMovie()");
		return movieDao.getMovie(movieId);
	}
}
