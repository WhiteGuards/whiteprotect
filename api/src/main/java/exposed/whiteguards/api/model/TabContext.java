package exposed.whiteguards.api.model;

import java.util.UUID;

public record TabContext(UUID sourceUuid, boolean console, String attemptedNamespace, long timestampMillis) implements Context {}