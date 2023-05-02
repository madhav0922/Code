package Behavioral_Design_Patterns.Chain_Of_Responsiblity_Pattern.Logger_Level;

import Behavioral_Design_Patterns.Chain_Of_Responsiblity_Pattern.Logger_Interface.Logger;

public class InfoLevelLogger extends Logger {
    public InfoLevelLogger(int levels) {
        this.levels = levels;
    }

    @Override
    public void displayLog(String msg) {
        System.out.println("[INFO] " + msg);
    }
}
