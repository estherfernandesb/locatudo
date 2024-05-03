package locatudo.model.models;

//Essa classe serve para unir as variáveis existentes nas
//classes "Movie" e "TvShow"

public class Title implements Comparable<Title>{
    private String name;
    private int releaseYear;
    private boolean planIncluded = true;
    private double sumOfRating;
    private double totalRating;
    private int duration;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public int getTotalRating(){
        return (int) totalRating;
    }

    public String getName() {
        return name;
    }


    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public void displaysTechnicalSheet(){
        System.out.println("Movie: " + name);
        System.out.println("Release year: " + releaseYear);
    }

    public void assesses(double note){
        sumOfRating += note;
        totalRating++;
    }

    public double average(){
        return sumOfRating / totalRating;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}
