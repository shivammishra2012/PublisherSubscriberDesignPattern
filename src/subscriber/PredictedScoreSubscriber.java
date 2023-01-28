package subscriber;

import publisher.Publisher;

public class PredictedScoreSubscriber implements Subscriber{

    private int runs;

    private int wickets;

    private float overs;

    public Publisher getPublisher() {
        return publisher;
    }

    private final Publisher publisher;

    public PredictedScoreSubscriber(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs=runs;
        this.wickets=wickets;
        this.overs=overs;
        // addition logic

        System.out.println(" PredictedScoreSubsriber "+this.runs+" runs"+this.wickets+"wickets"+this.overs+"overs");

    }

}
