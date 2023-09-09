import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class OptionPool {

    private ArrayList<Option> questions;
    private Integer[] votes;
    public OptionPool(ArrayList<Option> questionList){
        InitializeCollections(questionList);

        this.questions.addAll(questionList);

        System.out.println("Question pool created with given questions:");
        System.out.println(questionList);
    }

    private void InitializeCollections(ArrayList<Option> list){
        this.questions = new ArrayList<Option>();
        this.votes = new Integer[list.size()];
        Arrays.fill(votes, 0);
    }

    public void vote(int index){
        this.votes[index] += 1;
    }

    public void displayResults(){
        HashMap<String, Double> result = new HashMap<String, Double>();
        double allVotes = 0;
        for (int i = 0; i < votes.length; i++){
            allVotes += votes[i];
        }

        for (int i = 0; i < votes.length; i++){
            result.put(questions.get(i).getText(), votes[i]/allVotes);
        }

        System.out.println(result);
    }

}
