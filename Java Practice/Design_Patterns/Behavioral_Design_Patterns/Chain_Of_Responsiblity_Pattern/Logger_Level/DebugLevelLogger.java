package Behavioral_Design_Patterns.Chain_Of_Responsiblity_Pattern.Logger_Level;

import Behavioral_Design_Patterns.Chain_Of_Responsiblity_Pattern.Logger_Interface.Logger;

public class DebugLevelLogger extends Logger {

    public DebugLevelLogger(int levels) {
        this.levels = levels;
    }

    @Override
    public void displayLog(String msg) {
        System.out.println("[DEBUG] " + msg);
    }

}
