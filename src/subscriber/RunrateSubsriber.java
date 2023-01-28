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
    public void update() {
        // as per data is pulled from publisher as per requirement
        //now  we have more flexibility to consume as per our reqyuirements

        this.runs= publisher.getRuns();
        this.wickets= publisher.getWickets();
        this.overs= publisher.getOvers();
        // addition logic
        System.out.println(" RunrateSubsricber "+this.runs+" runs"+this.wickets+"wickets"+this.overs+"overs");

    }
}
