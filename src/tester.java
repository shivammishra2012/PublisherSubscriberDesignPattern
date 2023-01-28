import publisher.CricketBoardPublisher;
import publisher.Publisher;
import subscriber.PredictedScoreSubscriber;
import subscriber.RunrateSubsriber;
import subscriber.Subscriber;

import java.util.Arrays;
import java.util.List;

public class tester {
    private static void connect(Publisher publisher, List<Subscriber> subscribers)
    {
        for(Subscriber subscriber:subscribers)
        {
            publisher.subscribe(subscriber);
        }
    }
    public static void main(String[] args) {
        CricketBoardPublisher cricketBoardPublisher=new CricketBoardPublisher();
        RunrateSubsriber runrateSubsriber=new RunrateSubsriber(cricketBoardPublisher);
        PredictedScoreSubscriber predictedScoreSubscriber=new PredictedScoreSubscriber(cricketBoardPublisher);
        connect(cricketBoardPublisher, Arrays.asList(runrateSubsriber,predictedScoreSubscriber));
        cricketBoardPublisher.notifyAll(400,12,34);
        predictedScoreSubscriber.getPublisher().unsubscribe(predictedScoreSubscriber);
        cricketBoardPublisher.notifyAll(500,12,34);

    }
}
