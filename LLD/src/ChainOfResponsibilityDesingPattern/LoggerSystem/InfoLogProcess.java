package ChainOfResponsibilityDesingPattern.LoggerSystem;

public class InfoLogProcess extends LogProcessor{

    public  InfoLogProcess(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == INFO){
            System.out.println("Info "+message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
