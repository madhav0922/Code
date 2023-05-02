package Behavioral_Design_Patterns.Observer_Pattern.Events;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Behavioral_Design_Patterns.Observer_Pattern.Listeners.EventListener;

public class EventManager { // Subject Class
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>()); // Therefore for each operation we can have multiple
                                                              // subscribers
        }
        // listeners.forEach((key, value) -> System.out.println("constructor " + key + "
        // " + value));
    }

    // make pub-sub model. pub -> notify, sub -> subscribe
    // subscriber method
    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> eventListeners = listeners.get(eventType);
        eventListeners.add(listener);
        // System.out.println(listeners.size());
        // listeners.forEach((key, value) -> System.out.println("subscribe " + key + " "
        // + value));
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> eventListeners = listeners.get(eventType);
        eventListeners.remove(listener);
    }

    public void notifyListeners(String eventType, File file) {
        List<EventListener> eventListeners = listeners.get(eventType);
        for (EventListener event : eventListeners) {
            event.updateListeners(eventType, file);
        }
    }
}
