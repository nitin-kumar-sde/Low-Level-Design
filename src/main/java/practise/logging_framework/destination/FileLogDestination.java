package practise.logging_framework.destination;

public class FileLogDestination implements LogDestination{

    @Override
    public void writeLog(String message) {
        System.out.println("Writing to file: " + message);
    }
}
