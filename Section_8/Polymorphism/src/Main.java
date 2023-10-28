import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie theMovie = new Adventure("Star Wars");
        theMovie.watchMovie();
        Movie theMovie1 = Movie.getMovie("Science Fiction", "Stargate");
        theMovie.watchMovie();
        theMovie1.watchMovie();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type (A for adventure, C for comedy," +
                    " S for Science Fiction, or Q for quit): ");
            String type = scanner.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter movie title");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}