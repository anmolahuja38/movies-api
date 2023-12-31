package dev.anmol.movies.service;

import dev.anmol.movies.dao.MovieRepository;
import dev.anmol.movies.domain.Movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
