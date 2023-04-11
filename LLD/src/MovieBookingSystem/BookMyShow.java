package MovieBookingSystem;

import MovieBookingSystem.Enum.City;
import MovieBookingSystem.Enum.SeatCategory;

import java.util.ArrayList;
import java.util.List;

public class BookMyShow {
    MovieController movieController;
    TheaterController theaterController;


    BookMyShow(){
        movieController = new MovieController();
        theaterController = new TheaterController();
    }
    public static void main(String [] args){

        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.intialize();
    }

    public  void createMovie(){
        Movie bahubali = new Movie(1,"Bahubali",190);
        Movie dabang = new Movie(2,"Dabang",150);
        movieController.addMovie(bahubali,City.BANGALORE);
        movieController.addMovie(dabang,City.DELHI);
        movieController.addMovie(bahubali,City.BANGALORE);
        movieController.addMovie(dabang,City.DELHI);

    }

    public  void createTheater(){
        Movie dabang = movieController.getMovieByName("dabang");
        Movie bahubali = movieController.getMovieByName("bahubali");

        Theater cinepolls = new Theater();
        cinepolls.setTheaterID(1);
        cinepolls.setCity(City.DELHI);
        cinepolls.setScreens(creatScreen());
        List<Show> cinepollsShow = new ArrayList<>();
        Show show1 = creatShow(1,cinepolls.getScreens().get(0),bahubali,13);
        Show show2 = creatShow(2,cinepolls.getScreens().get(0),dabang,17);
        cinepollsShow.add(show1);
        cinepollsShow.add(show2);
        cinepolls.setShows(cinepollsShow);

        Theater pvr = new Theater();
        pvr.setTheaterID(1);
        pvr.setCity(City.BANGALORE);
        pvr.setScreens(creatScreen());
        List<Show> pvrShow = new ArrayList<>();
        Show pvrshow1 = creatShow(1,cinepolls.getScreens().get(0),bahubali,13);
        Show pvrshow2 = creatShow(2,cinepolls.getScreens().get(0),dabang,17);
        pvrShow.add(pvrshow1);
        pvrShow.add(pvrshow2);
        pvr.setShows(pvrShow);

        theaterController.addTheater(City.BANGALORE,pvr);
        theaterController.addTheater(City.DELHI,cinepolls);
    }

    public List<Screen> creatScreen(){
            List<Screen> screens = new ArrayList<>();
            Screen screen = new Screen();
            screen.setScreenID(1);
            screen.setSeatList(createSeat());
            screens.add(screen);
            return screens;
    }

    public List<Seat> createSeat(){
         List<Seat> seats = new ArrayList<>();
         //Create Silver Seat
        for(int i = 0; i < 40; i++){
            Seat seat = new Seat();
            seat.setSeatID(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seat.setRow(1);
            seats.add(seat);
        }

        // Create Gold Seat

        for(int i = 40; i < 80; i++){
            Seat seat = new Seat();
            seat.setSeatID(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seat.setRow(2);
            seats.add(seat);
        }


        // Create Platinum seat
        for(int i = 41; i < 120; i++){
            Seat seat = new Seat();
            seat.setSeatID(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seat.setRow(3);
            seats.add(seat);
        }

         return seats;
    }

    public Show creatShow(int showId, Screen screen, Movie movie, int showStartTime){
        Show show = new Show();
        show.setShowID(1);
        show.setStartTime(showStartTime);
        show.setMovie(movie);
        show.setScreen(screen);
        return show;
    }
    public void intialize(){
        createMovie();
        createTheater();
    }


}
