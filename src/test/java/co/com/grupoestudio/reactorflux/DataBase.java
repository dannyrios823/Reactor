package co.com.grupoestudio.reactorflux;

import org.junit.jupiter.api.BeforeEach;

import java.time.LocalTime;
import java.util.ArrayList;

public class DataBase {

    private static ArrayList<Movie> movies = new ArrayList<>();

    @BeforeEach
    void infoMovies() {
        movies.add(new Movie("The irishman", "Drama", 8.1, LocalTime.of(3, 29, 00)));
        movies.add(new Movie("Parasito", "Suspenso", 8.6, LocalTime.of(2, 12, 00)));
        movies.add(new Movie("JoJo Rabit", "Comedia", 8.0, LocalTime.of(1, 48, 00)));
        movies.add(new Movie("1917", "Drama", 8.7, LocalTime.of(1, 59, 00)));
        movies.add(new Movie("Once upon a time", "Drama", 7.8, LocalTime.of(2, 41, 00)));
        movies.add(new Movie("Joker", "Suspenso", 8.6, LocalTime.of(2, 02, 00)));
        movies.add(new Movie("Avengers End Game", "Suspenso", 8.6, LocalTime.of(2, 02, 00)));
        movies.add(new Movie("Pain and Glory", "Drama", 7.7, LocalTime.of(1, 53, 00)));
        movies.add(new Movie("Little Women", "Drama", 8.3, LocalTime.of(2, 15, 00)));
        movies.add(new Movie("Ford v Ferrari", "Drama", 8.3, LocalTime.of(2, 32, 00)));
    }
}
