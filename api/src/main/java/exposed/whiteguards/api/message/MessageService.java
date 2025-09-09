package exposed.whiteguards.api.message;

import net.kyori.adventure.text.Component;

public interface MessageService {
    Component component(String key, java.util.Map<String, Object> placeholders);
}

