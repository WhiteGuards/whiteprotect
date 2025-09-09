package exposed.whiteguards.api.policy;

import exposed.whiteguards.api.model.Context;
import exposed.whiteguards.api.model.Verdict;

import java.util.Optional;

public interface PolicyPipeline<C extends Context> {
    Optional<Verdict> firstMatch(C ctx);
}

