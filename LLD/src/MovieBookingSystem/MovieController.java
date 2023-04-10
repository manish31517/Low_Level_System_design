package MovieBookingSystem;

import MovieBookingSystem.Enum.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityVSMovies;
    List<Movie> movies;

    public MovieController() {
        movies = new ArrayList<>();
        cityVSMovies = new HashMap<>();
    }

    void addMovie(Movie movie, City city){
      movies.add(movie);
     List<Movie> movies1= cityVSMovies.getOrDefault(city,new ArrayList<>());
     movies1.add(movie);
     cityVSMovies.put(city,movies);
    }

    Movie getMovieByName(String movieName){
        for(Movie movie : movies){
            if(movieName.equals(movie)){
                return movie;
            }
        }
        return null;
    }

    List<Movie> getMoviesByCity(City city){
        return cityVSMovies.getOrDefault(city,new ArrayList<>());
    }

    //Remove movie from a particular city, make use of cityVsMovie map
    //update movie of a particular city, make use of cityVSMovies map
    // CRUD operation based on Movie ID, make use of all movies list




}
