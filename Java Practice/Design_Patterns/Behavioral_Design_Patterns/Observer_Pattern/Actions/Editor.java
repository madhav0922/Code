package Behavioral_Design_Patterns.Observer_Pattern.Actions;

import java.io.File;

import Behavioral_Design_Patterns.Observer_Pattern.Events.EventManager;
import Behavioral_Design_Patterns.Observer_Pattern.Listeners.LogEventListener;

public class Editor { // Subject Property Class
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        if (filePath != null) {
            // open file
            this.file = new File(filePath);
            // notify listeners
            events.notifyListeners("open", file);
        } else {
            System.out.println("Choose a file first.");
        }
    }

    public void saveFile() {
        if (file != null) {
            // save the file
            // notify listeners about saving the file
            events.notifyListeners("save", file);
        } else {
            System.out.println("No such file open");
        }
    }

    public void closeFile() {
        if (file != null) {
            // close the file

        } else {
            System.out.println("No such file open");
        }
    }

}
