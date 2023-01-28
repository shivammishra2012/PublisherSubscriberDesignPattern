package subscriber;

import publisher.Publisher;

public class RunrateSubsriber implements Subscriber{
    private int runs;

    private int wickets;

    private float overs;

    private final Publisher publisher;

    public RunrateSubsriber(Publisher publisher) {
        this.publisher = publisher;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs=runs;
        this.wickets=wickets;
        this.overs=overs;
        // addition logic
        System.out.println(" RunrateSubsricber "+this.runs+" runs"+this.wickets+"wickets"+this.overs+"overs");

    }
}
