package exposed.whiteguards.api.model;

import java.net.InetSocketAddress;

public record PreLoginContext(String username, InetSocketAddress remoteAddress, String proxyBrand, long timestampMillis) implements Context {}
