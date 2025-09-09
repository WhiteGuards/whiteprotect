package exposed.whiteguards.api.policy;

import exposed.whiteguards.api.model.Context;
import exposed.whiteguards.api.model.Verdict;

import java.util.Optional;

public interface Rule<C extends Context> {
   Optional<Verdict> evaluate(C ctx);
}

