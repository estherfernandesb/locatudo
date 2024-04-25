package locatudo.model.calculator;
import locatudo.model.models.Title;

//Essa classe foi criada para calcular o tempo das séries e filmes que estão na classe "Main"

public class TimeCalculator {
    private int totalTime = 0;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void marathon(Title title){
        this.totalTime += title.getDuration();
    }
}