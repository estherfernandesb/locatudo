package locatudo.model.models;
//Essa classe foi criada para atribuir todos os valores das
// variáveis que vão distinguir tudo que é preciso para a descrição e avaliação das séries no catálogo

public class TvShow extends Title {
    private int season;
    private boolean activity = true;
    private int seasonEps;
    private String directorName;

    public TvShow(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getSeason() {
        return season;
    }

    public boolean isActivity() {
        return activity;
    }

    public int getSeasonEps() {
        return seasonEps;
    }


    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }

    public void setSeasonEps(int seasonEps) {
        this.seasonEps = seasonEps;
    }

    @Override
    public int getDuration(){
        return super.getDuration();
    }
}
