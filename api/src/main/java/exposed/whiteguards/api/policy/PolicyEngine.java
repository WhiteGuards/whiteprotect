package exposed.whiteguards.api.policy;

import exposed.whiteguards.api.model.ChatContext;
import exposed.whiteguards.api.model.PreLoginContext;
import exposed.whiteguards.api.model.TabContext;
import exposed.whiteguards.api.model.Verdict;

public interface PolicyEngine {
    Verdict evaluatePreLogin(PreLoginContext ctx);
    Verdict evaluateChat(ChatContext ctx);
    Verdict evaluateTab(TabContext ctx);
}
