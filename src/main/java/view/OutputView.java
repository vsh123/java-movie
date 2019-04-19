package view;

import domain.Movie;
import domain.MovieRepository;
import domain.PlaySchedule;

import java.util.List;

public class OutputView {
    public static void printMovies(List<Movie> movies) {
        System.out.println("##상영 영화 목록");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public static Movie printPlaySchedule(int movieId) {
        Movie selectedMovie = MovieRepository.getPlaySchedule(movieId);
        System.out.println(selectedMovie);
        return selectedMovie;
    }

    public static void paymentStart(){
        System.out.println("결제를 진행합니다.");
    }
}
