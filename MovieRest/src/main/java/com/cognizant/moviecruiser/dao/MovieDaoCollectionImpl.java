package com.cognizant.moviecruiser.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.moviecruiser.exception.MovieNotFoundException;
import com.cognizant.moviecruiser.model.Movie;

@Repository
public class MovieDaoCollectionImpl implements MovieDao 
{
	private static List<Movie> movieList=new ArrayList<Movie>();
	private static final Logger LOGGER=LoggerFactory.getLogger(MovieDaoCollectionImpl.class);
	
	@SuppressWarnings({ "unchecked", "resource" })
	public MovieDaoCollectionImpl() {
		// TODO Auto-generated constructor stub
		ApplicationContext context=new ClassPathXmlApplicationContext("movie.xml");
		movieList=(List<Movie>)context.getBean("movies",ArrayList.class);
		LOGGER.info("Movie:{}",movieList);
	}

	@Override
	public List<Movie> getMovieListCustomer(){
		return movieList;
	}

	@Override
	public void modifyMovie(Movie movie) throws MovieNotFoundException {
		LOGGER.info("START:MovieDaoCollectionImpl modifyMovie()");
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).equals(movie)) {
				movieList.set(i, movie);
				break;
			}
		}
		LOGGER.info("END:MovieDaoCollectionImpl modifyMovie()");

	}

	@Override
	public Movie getMovie(long movieId) throws MovieNotFoundException {
		LOGGER.info("START:MovieDaoCollectionImpl getMovie()");
		Movie movie = null;
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getId() == movieId) {
				movie = movieList.get(i);
				break;
			}
		}
		LOGGER.info("END:MovieDaoCollectionImpl getMovie()");
		return movie;
	}

}
