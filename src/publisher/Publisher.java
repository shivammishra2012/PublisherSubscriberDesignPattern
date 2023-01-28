package publisher;

import subscriber.Subscriber;

public interface Publisher {

    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifyAll(int runs,int wickets,int overs);

    int getRuns();

    float getOvers();

    int getWickets();
}
