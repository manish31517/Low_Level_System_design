package MovieBookingSystem;

public class Movie {
    int movieID;
    String name;
    int movieDuration;

    public Movie(int movieID, String name, int movieDuration) {
        this.movieID = movieID;
        this.name = name;
        this.movieDuration = movieDuration;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieID=" + movieID +
                ", name='" + name + '\'' +
                ", movieDuration=" + movieDuration +
                '}';
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }
}
