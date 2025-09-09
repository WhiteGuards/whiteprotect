package exposed.whiteguards.api.model;

import java.net.InetSocketAddress;
import java.util.UUID;

public record ChatContext(UUID playerUuid, InetSocketAddress remoteAddress, int messageLength, long timestampMillis) implements Context {}
