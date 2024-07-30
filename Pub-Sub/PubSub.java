// Publisher Interface
public interface Publisher {
    void registerSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(String message);
}

// Subscriber Interface
public interface Subscriber {
    void update(String message);
}

import java.util.ArrayList;
import java.util.List;

// Concrete Publisher
public class NewsPublisher implements Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }

    public void publish(String message) {
        System.out.println("Publishing message: " + message);
        notifySubscribers(message);
    }
}

// Concrete Subscriber
public class NewsSubscriber implements Subscriber {
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}

public class PubSubExample {
    public static void main(String[] args) {
        // Create publisher
        NewsPublisher publisher = new NewsPublisher();

        // Create subscribers
        Subscriber subscriber1 = new NewsSubscriber("Subscriber 1");
        Subscriber subscriber2 = new NewsSubscriber("Subscriber 2");

        // Register subscribers
        publisher.registerSubscriber(subscriber1);
        publisher.registerSubscriber(subscriber2);

        // Publish messages
        publisher.publish("Breaking News: New Java Version Released!");
        publisher.publish("Weather Update: It's sunny today!");

        // Remove a subscriber and publish another message
        publisher.removeSubscriber(subscriber1);
        publisher.publish("Stock Market Update: Prices are rising!");
    }
}
