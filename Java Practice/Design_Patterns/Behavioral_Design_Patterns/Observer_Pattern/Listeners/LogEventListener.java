package Behavioral_Design_Patterns.Observer_Pattern.Listeners;

import java.io.File;

public class LogEventListener implements EventListener {
    private File log;

    public LogEventListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void updateListeners(String eventType, File file) {
        System.out.println("[Updated listener] Log " + log + " added for file: " + file + ", event type: " + eventType);
    }
}
