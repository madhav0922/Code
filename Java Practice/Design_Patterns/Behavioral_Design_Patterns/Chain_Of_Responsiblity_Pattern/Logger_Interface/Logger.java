package Behavioral_Design_Patterns.Chain_Of_Responsiblity_Pattern.Logger_Interface;

public abstract class Logger {
    public static int OUTPUTINFO = 1;
    public static int DEBUGINFO = 2;
    public static int ERRORINFO = 3;
    protected int levels;
    protected Logger nextLevelLogger;

    public void setNextLevelLogger(Logger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    public void logMessage(int levels, String msg) {
        if (this.levels <= levels) {
            displayLog(msg);
        }
        if (nextLevelLogger != null) {
            nextLevelLogger.logMessage(levels, msg);
        }
    }

    public abstract void displayLog(String msg);
}
