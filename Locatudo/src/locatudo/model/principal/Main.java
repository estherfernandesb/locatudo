package locatudo.model.principal;

import locatudo.model.calculator.Recommended;
import locatudo.model.calculator.TimeCalculator;
import locatudo.model.models.Episode;
import locatudo.model.models.Movie;
import locatudo.model.models.TvShow;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Alien", 1979);
        myMovie.setDirectorName("Ridley Scott");
        myMovie.setPlanIncluded(true);
        myMovie.setDuration(94);

        myMovie.displaysTechnicalSheet();
        myMovie.assesses(4.8); // Public
        myMovie.assesses(4.5); // Rotten Tomatoes
        myMovie.assesses(4.3); // Letterboxd

        System.out.println("Duration: " + myMovie.getDuration());
        System.out.println("Total rating: " + myMovie.getTotalRating());
        System.out.println(myMovie.average());

        TvShow mySeries = new TvShow("Breaking Bad", 2008);
        mySeries.setDirectorName("Vince Gilligan");
        mySeries.setSeason(5);
        mySeries.setSeasonEps(16);
        mySeries.setActivity(true);
        mySeries.setDuration(50);

        mySeries.assesses(4.8); // Public
        mySeries.assesses(5);   // Rotten Tomatoes
        mySeries.assesses(4.5); // Letterboxd

        mySeries.displaysTechnicalSheet();
        System.out.println("Duration by episodes: " + mySeries.getDuration());

        Movie otherMovie = new Movie("Anatomy of a Fall", 2023);
        otherMovie.setDirectorName("Justine Triet");
        otherMovie.setPlanIncluded(true);
        otherMovie.setDuration(138);

        otherMovie.assesses(4.8); // Public
        otherMovie.assesses(5);   // Rotten Tomatoes
        otherMovie.assesses(4.5); // Letterboxd

        otherMovie.displaysTechnicalSheet();

        var thirdMovie = new Movie("Kill Bill Vol.2", 2004);
        thirdMovie.setDirectorName("Quentin Tarantino");
        thirdMovie.setPlanIncluded(true);
        thirdMovie.setDuration(130);

        thirdMovie.assesses(4.3); // Public
        thirdMovie.assesses(4.2); // Rotten Tomatoes
        thirdMovie.assesses(4.5); // Letterboxd

        thirdMovie.displaysTechnicalSheet();

        TimeCalculator calculator = new TimeCalculator();
        calculator.marathon(myMovie);
        calculator.marathon(otherMovie);
        calculator.marathon(thirdMovie);
        calculator.marathon(mySeries);
        System.out.println("Marathon time: " + calculator.getTotalTime() + "min");

        Recommended filter = new Recommended();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(mySeries);
        episode.setTotalViews(1000);
        filter.filter(episode);

        var movieList = new ArrayList<Movie>();
        movieList.add(myMovie);
        movieList.add(otherMovie);
        movieList.add(thirdMovie);
        System.out.println("Number of movies in the list: " + movieList.size());
        System.out.println("First movie: " + movieList.get(0).getName());
        System.out.println(movieList);
        System.out.println("toString movies: " + movieList.get(0).toString());
    }
}
