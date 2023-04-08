package CompositeDesingPattern.FileSystem;

public class Main {
    public static void main(String[] args) {
        Directory movie = new Directory("Movie");
        File border = new File("Border");
        Directory comedyMovie = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");

        comedyMovie.add(hulchul);
        movie.add(border);
        movie.add(comedyMovie);

        //movie directory
        movie.ls();
        comedyMovie.ls();
    }
}
