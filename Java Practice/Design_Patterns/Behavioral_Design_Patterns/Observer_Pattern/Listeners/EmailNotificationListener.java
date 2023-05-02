package Behavioral_Design_Patterns.Observer_Pattern.Listeners;

import java.io.File;

public class EmailNotificationListener implements EventListener { // One of the Concrete Observer class
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void updateListeners(String eventType, File file) {
        System.out.println("[Updated listener] Sending email to " + this.email + " for file: " + file + ", event type: "
                + eventType);
    }

}
