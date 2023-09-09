import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Option> options = new ArrayList<>(){
            {
                add(new Option("Option 0"));
                add(new Option("Option 1"));
                add(new Option("Option 2"));
                add(new Option("Option 3"));
            }
        };
        PollFeature poll = new PollFeature(options);

        poll.vote(0);
        poll.vote(0);
        poll.vote(0);

        poll.vote(1);

        poll.vote(2);
        poll.vote(2);

        poll.vote(3);

        poll.displayResults();
    }



}