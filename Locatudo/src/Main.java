import locatudo.model.calculator.Recommended;
import locatudo.model.calculator.TimeCalculator;
import locatudo.model.models.Episode;
import locatudo.model.models.Movie;
import locatudo.model.models.TvShow;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Alien");
        myMovie.setReleaseYear(1979);
        myMovie.setDirectorName("Ridley Scott");
        myMovie.setPlanIncluded(true);
        myMovie.setDuration(94);

        myMovie.displaysTechnicalSheet();
        myMovie.assesses(4.8); // Public
        myMovie.assesses(4.5); // Rotten Tomatoes
        myMovie.assesses(4.3); //Letterboxd

        System.out.println("Duration: " + myMovie.getDuration());
        System.out.println("Total rating: " + myMovie.getTotalRating());
        System.out.println(myMovie.average());

        TvShow mySeries = new TvShow();
        mySeries.setName("Breaking Bad");
        mySeries.setReleaseYear(2008);
        mySeries.setDirectorName("Vince Gilligan");
        mySeries.setSeason(5);
        mySeries.setSeasonEps(16);
        mySeries.setActivity(true);
        mySeries.setDuration(50);

        mySeries.displaysTechnicalSheet();
        mySeries.assesses(4.8); // Public
        mySeries.assesses(5); // Rotten Tomatoes
        mySeries.assesses(4.5); //Letterboxd

        mySeries.displaysTechnicalSheet();
        System.out.println("Duration by episodes: " + mySeries.getDuration());

        Movie otherMovie = new Movie();
        otherMovie.setName("Anatomy of a Fall");
        otherMovie.setReleaseYear(2023);
        otherMovie.setDirectorName("Justine Triet");
        otherMovie.setPlanIncluded(true);
        otherMovie.setDuration(138);

        otherMovie.displaysTechnicalSheet();

        TimeCalculator calculator = new TimeCalculator();
        calculator.marathon(myMovie);
        calculator.marathon(otherMovie);
        calculator.marathon(mySeries);
        System.out.println("Marathon time: " + calculator.getTotalTime() + "min");

        Recommended filter = new Recommended();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(mySeries);
        episode.setTotalViews(1000);
        filter.filter(episode);
    }
}
