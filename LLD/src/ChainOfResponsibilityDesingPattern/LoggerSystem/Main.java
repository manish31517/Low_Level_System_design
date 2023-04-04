package ChainOfResponsibilityDesingPattern.LoggerSystem;

public class Main {
 public  static void main(String [] args){
     LogProcessor infoLogProcessor = new InfoLogProcess(new DebugLogProcess(new ErrorLogProcess(null)));
     infoLogProcessor.log(LogProcessor.INFO,"This is info log");
     infoLogProcessor.log(LogProcessor.DEBUG,"This is Debug log");
     infoLogProcessor.log(LogProcessor.ERROR,"This is Error log");
 }

}
