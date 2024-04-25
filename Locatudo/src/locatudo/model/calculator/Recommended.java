package locatudo.model.calculator;

//Essa classes vai puxar as avaliações feitas na classe "Main"
// e vai definir como o filme ou série está sendo avaliado no momento
public class Recommended {

    public void filter(Sortable sortable){
        if(sortable.getClassification() >= 4){
            System.out.println("It's among the best in streaming.");
        } else if(sortable.getClassification() >= 2) {
            System.out.println("It was a good recommendation.");
        } else{
            System.out.println("Evaluate this!");
        }
    }
}
