package Behavioral_Design_Patterns.Chain_Of_Responsiblity_Pattern.Client;

import Behavioral_Design_Patterns.Chain_Of_Responsiblity_Pattern.Logger_Interface.Logger;
import Behavioral_Design_Patterns.Chain_Of_Responsiblity_Pattern.Logger_Level.DebugLevelLogger;
import Behavioral_Design_Patterns.Chain_Of_Responsiblity_Pattern.Logger_Level.ErrorLevelLogger;
import Behavioral_Design_Patterns.Chain_Of_Responsiblity_Pattern.Logger_Level.InfoLevelLogger;

/*
 * Chain of Responsibility
 * Mostly Similar to Decorator Pattern
 * Order of Communication
 * Avoid coupling the sender of a request to its receiver, by giving multiple objects a chance to handle requests.
 * eg: SBI counters, Exception Handling, Logger (with levels)
 */
public class Main {
    private static Logger doChaining() {
        Logger infoLogger = new InfoLevelLogger(Logger.OUTPUTINFO);
        Logger debugLogger = new DebugLevelLogger(Logger.DEBUGINFO);
        infoLogger.setNextLevelLogger(debugLogger);
        Logger errorLogger = new ErrorLevelLogger(Logger.ERRORINFO);
        debugLogger.setNextLevelLogger(errorLogger);

        return infoLogger;
    }

    public static void main(String[] args) {
        Logger chainLogger = doChaining();

        chainLogger.logMessage(Logger.OUTPUTINFO, "Info Msg");
        chainLogger.logMessage(Logger.DEBUGINFO, "Debug Msg");
        chainLogger.logMessage(Logger.ERRORINFO, "Error Msg");
    }
}
