package com.assignment.designPatterns.Singleton.ConnectionPool.self;

import java.util.concurrent.atomic.AtomicBoolean;

public class DatabaseConnection {
    private AtomicBoolean available;  // Thread-safe flag for availability

    public DatabaseConnection() {
        this.available = new AtomicBoolean(true);  // Initially available
    }

    public boolean isAvailable() {
        return available.get();
    }

    public void setAvailable(boolean available) {
        this.available.set(available);
    }
}