package ChainOfResponsibilityDesingPattern.LoggerSystem;

public class DebugLogProcess extends LogProcessor{
    public DebugLogProcess(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public  void log(int logLevel, String message){
        if(logLevel == DEBUG){
            System.out.println("Debug "+message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
