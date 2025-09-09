package exposed.whiteguards;

import exposed.whiteguards.api.RateLimiter;
import exposed.whiteguards.api.SchedulerFacade;
import exposed.whiteguards.api.message.MessageService;
import exposed.whiteguards.api.policy.PolicyEngine;

public class CoreFacade {
    private final PolicyEngine policies; private final MessageService msg;
    private final RateLimiter limiter; private final SchedulerFacade scheduler;
    public CoreFacade(PolicyEngine p, MessageService m, RateLimiter r, SchedulerFacade s) {
        this.policies=p; this.msg=m; this.limiter=r; this.scheduler=s;
    }
    public PolicyEngine policy(){ return policies; }
    public MessageService messages(){ return msg; }
    public RateLimiter limiter(){ return limiter; }
    public SchedulerFacade scheduler(){ return scheduler; }
}
