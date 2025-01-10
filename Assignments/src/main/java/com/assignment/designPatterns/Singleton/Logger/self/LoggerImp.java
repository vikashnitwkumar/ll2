package main.java.com.assignment.designPatterns.Singleton.Logger.self;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
// LoggerImpl class implementing Logger interface and Singleton pattern
public class LoggerImpl implements Logger {
    private static volatile LoggerImpl instance;
    private PrintWriter writer;
    private String logFilePath;
    private boolean isClosed = false;  // Flag to track if the logger is closed

    // Private constructor to prevent instantiation
    private LoggerImpl() {}

    // Singleton getInstance() method
    public static LoggerImpl getInstance() {
        if (instance == null) {
            synchronized (LoggerImpl.class) {
                if (instance == null) {
                    instance = new LoggerImpl();
                }
            }
        }
        return instance;
    }

    // Reset the instance (to be used for testing or reinitialization)
    public static void resetInstance() {
        instance = null;
    }

    // Method to set the log file path and initialize file writer
    @Override
    public void setLogFile(String filePath) {
        if (writer != null) {
            throw new IllegalStateException("Logger already initialized with a log file.");
        }

        try {
            this.logFilePath = filePath;
            FileWriter fileWriter = new FileWriter(filePath, true);  // Append mode
            writer = new PrintWriter(fileWriter);
        } catch (IOException e) {
            throw new IllegalStateException("Error initializing log file.", e);
        }
    }

    // Method to log messages with the given LogLevel
    @Override
    public void log(LogLevel level, String message) {
        if (isClosed) {
            throw new IllegalStateException("Logger is closed and cannot log messages.");
        }

        if (writer == null) {
            throw new IllegalStateException("Logger not initialized with a log file.");
        }

        // Create timestamp and format the log message
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String logMessage = String.format("%s [%s] %s", timestamp, level, message);

        // Write the log message to the file
        writer.println(logMessage);
    }

    // Method to return the log file path
    @Override
    public String getLogFile() {
        return logFilePath;
    }

    // Method to flush the logs to the file
    @Override
    public void flush() {
        if (writer != null) {
            writer.flush();
        }
    }

    // Method to close the logger and release resources
    @Override
    public void close() {
        if (writer != null) {
            writer.close();
            isClosed = true;  // Mark the logger as closed
        }
    }
}