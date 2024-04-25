package locatudo.model.models;
import locatudo.model.calculator.Sortable;

public class Episode implements Sortable {
    private int number;
    private String name;
    private TvShow series;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TvShow getSeries() {
        return series;
    }

    public void setSeries(TvShow series) {
        this.series = series;
    }

    @Override
    public double getClassification() {
        if (totalViews > 1000){
            return 4;
        } else {
            return 0;
        }

    }
}
