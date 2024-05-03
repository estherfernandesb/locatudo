package locatudo.model.principal;
import locatudo.model.models.Movie;
import locatudo.model.models.Title;
import locatudo.model.models.TvShow;

import java.util.*;

public class MainLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Alien", 1979);
        myMovie.assesses(10);
        TvShow mySeries = new TvShow("Breaking Bad", 2008);
        mySeries.assesses(9.3);
        Movie otherMovie = new Movie("Anatomy of a Fall", 2023);
        otherMovie.assesses(9.5);
        var thirdMovie = new Movie("Kill Bill Vol.2", 2004);
        thirdMovie.assesses(8.3);

        ArrayList<Title> streamList = new ArrayList<>();
        streamList.add(myMovie);
        streamList.add(otherMovie);
        streamList.add(thirdMovie);
        streamList.add(mySeries);

        for (Title iten: streamList){
            System.out.println(iten.getName());
            if(iten instanceof Movie movie && movie.getClassification() > 2){
                System.out.println("Classification: " + movie.getClassification());
            }
        }

        List<String> artistSearch = new LinkedList<>();
        artistSearch.add("Sigourney Weaver");
        artistSearch.add("Bryan Cranston");
        artistSearch.add("Uma Thurman");
        artistSearch.add("Sandra Hüller");
        System.out.println(artistSearch);

        Collections.sort(artistSearch);
        System.out.println("After ordination");
        System.out.println(artistSearch);

        Collections.sort(streamList);
        System.out.println("Titles ordered");
        System.out.println(streamList);

        streamList.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println("After year ordination");
        System.out.println(streamList);

    }
}
