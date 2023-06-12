package ra.Model;

import java.time.Duration;
import java.time.Instant;

public class StopWatch {
    private Instant startTime;
    private Instant endTime;

    public StopWatch() {
        startTime = Instant.now();
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }

    public void start() {
        startTime = Instant.now();
    }

    public void stop() {
        endTime = Instant.now();
    }

    public long getElapsedTime() {
        if (endTime != null) {
            return Duration.between(startTime, endTime).toMillis();
        } else {
            return Duration.between(startTime, Instant.now()).toMillis();
        }
    }
}
