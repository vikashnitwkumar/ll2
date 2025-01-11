package main.java.com.assignment.designPatterns.Singleton.ConnectionPool.self;



import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConnectionPoolImpl implements ConnectionPool {
    private static ConnectionPoolImpl instance;
    private Queue<DatabaseConnection> dbConnectionList;
    private int totalSize;
    private int availableSize;

    // Private constructor to prevent direct instantiation
    private ConnectionPoolImpl(int maxConnections) {
        totalSize = maxConnections;
        availableSize = maxConnections;
        dbConnectionList = new ConcurrentLinkedQueue<>(); // thread-safe queue
    }

    public static ConnectionPoolImpl getInstance(int maxConnections) {
        if (instance == null) {
            synchronized (ConnectionPoolImpl.class) {
                if (instance == null) {
                    instance = new ConnectionPoolImpl(maxConnections);
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }

    @Override
    public void initializePool() {
        // Initialize the pool with the max number of connections
        for (int i = 0; i < totalSize; i++) {
            dbConnectionList.add(new DatabaseConnection());
        }
    }

    @Override
    public DatabaseConnection getConnection() {
        // Check if there's an available connection
        if (availableSize > 0) {
            DatabaseConnection connection = dbConnectionList.poll(); // Get connection from the pool
            if (connection != null) {
                connection.setAvailable(false); // Mark connection as unavailable
                availableSize--; // Decrease available count
                return connection;
            }
        }
        // If no connection is available, return null
        return null;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        // Mark the connection as available and add it back to the pool
        connection.setAvailable(true);
        dbConnectionList.add(connection);
        availableSize++; // Increase available count
    }

    @Override
    public int getAvailableConnectionsCount() {
        return availableSize; // Return available connections count
    }

    @Override
    public int getTotalConnectionsCount() {
        return totalSize; // Return total number of connections
    }
}
