package Behavioral_Design_Patterns.Observer_Pattern;

import Behavioral_Design_Patterns.Observer_Pattern.Actions.Editor;
import Behavioral_Design_Patterns.Observer_Pattern.Listeners.EmailNotificationListener;
import Behavioral_Design_Patterns.Observer_Pattern.Listeners.LogEventListener;

public class Main { // Driver Class
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogEventListener(
                "/Volumes/Work/Code/Java Practice/Design_Patterns/Behavioral_Design_Patterns/Observer_Pattern/logfile.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("abc@xyz.com"));

        try {
            editor.openFile(
                    "/Volumes/Work/Code/Java Practice/Design_Patterns/Behavioral_Design_Patterns/Observer_Pattern/logfile.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
