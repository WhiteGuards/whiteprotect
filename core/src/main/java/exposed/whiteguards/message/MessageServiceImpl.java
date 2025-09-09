package exposed.whiteguards.message;

import exposed.whiteguards.api.message.MessageCatalog;
import exposed.whiteguards.api.message.MessageService;
import net.kyori.adventure.text.Component;

import java.util.Map;

public final class MessageServiceImpl implements MessageService {
    private final MessageCatalog catalog;

    public MessageServiceImpl(MessageCatalog catalog) {
        this.catalog = catalog;
    }

    @Override public Component component(String key, Map<String,Object> placeholders) {
        return catalog.get(key, placeholders);
    }
}
