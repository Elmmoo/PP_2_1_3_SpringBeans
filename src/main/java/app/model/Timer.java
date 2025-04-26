package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {
    private static final Timer instance = new Timer();
    private Long nanoTime = System.nanoTime();

    private Timer() {}

    public static Timer getInstance() {
        return instance;
    }

    public Long getTime() {
        return nanoTime;
    }
}
