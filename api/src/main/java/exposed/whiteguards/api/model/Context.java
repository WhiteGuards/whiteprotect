package exposed.whiteguards.api.model;

public sealed interface Context permits PreLoginContext, ChatContext, TabContext {}
