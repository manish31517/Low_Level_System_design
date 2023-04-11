package MovieBookingSystem;

import MovieBookingSystem.Enum.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {
    Map<City, List<Theater>> cityVSTheater;
    List<Theater> theaters;

    public TheaterController(){
        cityVSTheater = new HashMap<>();
        theaters = new ArrayList<>();
    }

    public  void addTheater(City city, Theater theater){
        theaters.add(theater);
        List<Theater> theaters1 = cityVSTheater.getOrDefault(city,new ArrayList<>());
        theaters1.add(theater);
        cityVSTheater.put(city,theaters1);
    }

    Map<Theater,List<Show>> getAllShow(Movie movie, City city){
           Map<Theater,List<Show>> theaterVSShow = new HashMap<>();

           for(Theater theater : cityVSTheater.get(city)) {
               List<Show> shows = theater.getShows();
               List<Show> givenMoveShows = new ArrayList<>();

               for (Show show : shows) {
                   if (show.movie.getMovieID() == movie.getMovieID()) {
                       givenMoveShows.add(show);
                   }
                   theaterVSShow.put(theater, givenMoveShows);
               }
           }
           return theaterVSShow;
}
}
