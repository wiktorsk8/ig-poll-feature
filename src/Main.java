import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Option> options = new ArrayList<Option>(){
            {
                add(new Option("Option 0"));
                add(new Option("Option 1"));
                add(new Option("Option 2"));
                add(new Option("Option 3"));
            }
        };
        OptionPool pool = new OptionPool(options);

        pool.vote(0);
        pool.vote(0);
        pool.vote(0);

        pool.vote(1);

        pool.vote(2);
        pool.vote(2);

        pool.vote(3);

        pool.displayResults();
    }



}