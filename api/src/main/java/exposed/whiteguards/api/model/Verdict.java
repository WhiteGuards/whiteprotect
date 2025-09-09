package exposed.whiteguards.api.model;

import net.kyori.adventure.text.Component;

public sealed interface Verdict permits Verdict.Allow, Verdict.Deny, Verdict.Throttle {
    record Allow() implements Verdict {}
    record Deny(Component reason) implements Verdict {}
    record Throttle(long retryAfterMillis) implements Verdict {}
}

