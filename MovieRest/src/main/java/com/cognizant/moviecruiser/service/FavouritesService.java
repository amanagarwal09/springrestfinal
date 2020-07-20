package com.cognizant.moviecruiser.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.dao.FavouritesDao;
import com.cognizant.moviecruiser.dao.FavouritesDaoCollectionImpl;
import com.cognizant.moviecruiser.exception.MovieNotFoundException;
import com.cognizant.moviecruiser.model.Movie;

@Service
public class FavouritesService 
{
	private static Logger LOGGER=LoggerFactory.getLogger(FavouritesService.class);
	
	@Autowired
	private FavouritesDao favDao;
	
	public void addToFavourites(String userid, long movieId) throws MovieNotFoundException {
		LOGGER.info("START:FavouritesService addToFavourites()");
		favDao.addToFavourites(userid, movieId);
		LOGGER.info("END:FavouritesService addToFavourites()");
	}
	
	public List<Movie> getAllFavouritesMovies(String userid) {
		LOGGER.info("START:FavouritesService getAllFavouritesMovies()");
		LOGGER.info("END:FavouritesService getAllFavouritesMovies()");
		return favDao.getAllFavouritesMovies(userid);
	}
	
	public void removeFromFavourites(String userid, long movieId) throws MovieNotFoundException {
		LOGGER.info("START:FavouritesService removeFromFavourites()");
		favDao.removeFromFavourites(userid, movieId);
		LOGGER.info("END:FavouritesService removeFromFavourites()");
	}
	
	public long gettotalFavourites(String userid) {
		LOGGER.info("START:FavouritesService gettotalFavourites()");
		LOGGER.info("END:FavouritesService gettotalFavourites()");
		return favDao.gettotalFavourites(userid);
	}
	
}
