package locatudo.model.models;
import locatudo.model.calculator.Sortable;

//Essa classe foi criada para atribuir todos os valores das
// variáveis que vão distinguir tudo que é preciso para a descrição e avaliação dos filmes no catálogo

public class Movie extends Title implements Sortable {
    private String directorName;

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    @Override
    public double getClassification() {
        return (int) (average() / 2);
    }
}
