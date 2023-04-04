package ChainOfResponsibilityDesingPattern.LoggerSystem;

public class ErrorLogProcess  extends LogProcessor{
    public  ErrorLogProcess(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public  void log(int logLevel, String message){
        if(logLevel == ERROR){
            System.out.println("Eroor "+message);
        }
        else
        {
            super.log(logLevel,message);
        }
    }

}
