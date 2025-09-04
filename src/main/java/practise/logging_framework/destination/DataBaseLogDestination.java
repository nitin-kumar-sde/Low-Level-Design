package practise.logging_framework.destination;

public class DataBaseLogDestination implements LogDestination {

    @Override
    public void writeLog(String message) {
        // Simulate writing to a database
        System.out.println("Writing to database: " + message);
    }
}
