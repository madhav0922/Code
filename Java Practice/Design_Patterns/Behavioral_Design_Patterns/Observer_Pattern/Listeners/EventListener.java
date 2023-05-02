package Behavioral_Design_Patterns.Observer_Pattern.Listeners;

import java.io.File;

public interface EventListener { // Concrete class interface
    public void updateListeners(String eventType, File file);
}
