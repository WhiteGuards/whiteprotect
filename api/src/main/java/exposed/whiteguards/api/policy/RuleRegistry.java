package exposed.whiteguards.api.policy;

import exposed.whiteguards.api.model.ChatContext;
import exposed.whiteguards.api.model.PreLoginContext;
import exposed.whiteguards.api.model.TabContext;

import java.util.List;

public interface RuleRegistry {
    List<Rule<PreLoginContext>> preLoginRules();
    List<Rule<ChatContext>> chatRules();
    List<Rule<TabContext>> tabRules();
}

