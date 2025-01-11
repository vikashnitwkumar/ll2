package main.java.com.assignment.designPatterns.Singleton.ConnectionPool;


import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConnectionPoolImpl implements ConnectionPool {
    private static ConnectionPoolImpl  instance;
    Queue<DatabaseConnection> dbConnectionList;
    private int totalSize;
    private int currSize;
    private ConnectionPoolImpl(int maxConnections){
        totalSize = maxConnections;
        currSize = 0;
        dbConnectionList = new ConcurrentLinkedQueue<>();
    }
    public static ConnectionPoolImpl getInstance(int maxConnections){
        if(instance == null){
            synchronized(ConnectionPoolImpl.class){
                if(instance == null){
                    instance = new ConnectionPoolImpl( maxConnections);
                }
            }
        }
        return instance;
    }
    public static void resetInstance(){
        instance = null;
    }
    @Override
    public void initializePool() {
        while(totalSize>currSize){
            dbConnectionList.add(new DatabaseConnection());
            currSize++;
        }
    }

    @Override
    public DatabaseConnection getConnection() {
        if(currSize>0){
            dbConnectionList.peek().available = false;
        }
        currSize--;
        return dbConnectionList.poll();
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        connection.available = true;
        currSize++;
        dbConnectionList.add(connection);
    }

    @Override
    public int getAvailableConnectionsCount() {
        return currSize;
    }

    @Override
    public int getTotalConnectionsCount() {
        return totalSize;
    }
}