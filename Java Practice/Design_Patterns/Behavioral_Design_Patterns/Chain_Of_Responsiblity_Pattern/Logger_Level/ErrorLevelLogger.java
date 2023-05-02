package Behavioral_Design_Patterns.Chain_Of_Responsiblity_Pattern.Logger_Level;

import Behavioral_Design_Patterns.Chain_Of_Responsiblity_Pattern.Logger_Interface.Logger;

public class ErrorLevelLogger extends Logger {
    public ErrorLevelLogger(int levels) {
        this.levels = levels;
    }

    @Override
    public void displayLog(String msg) {
        System.out.println("[ERROR] " + msg);
    }
}
