package exposed.whiteguards.api.message;

import net.kyori.adventure.text.Component;

import java.util.Map;

public interface MessageCatalog {
    Component get(String key, Map<String,Object> ctx);
}
