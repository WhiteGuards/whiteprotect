package exposed.whiteguards.api;

public interface RateLimiter {
    boolean acquire(LimitKey key, int tokens);
}

