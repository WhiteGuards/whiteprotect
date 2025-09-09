package exposed.whiteguards.schedule;

import exposed.whiteguards.api.SchedulerFacade;

import java.util.UUID;

public final class NoopScheduler implements SchedulerFacade {
    public void runGlobal(Runnable runnable){ runnable.run(); }
    public void runAsync(Runnable runnable){ new Thread(runnable,"wp-async").start(); }
    public void runAtRegion(double x,double y,double z,String world,Runnable runnable){ runnable.run(); }
    public void runOnEntity(UUID id, Runnable runnable){ runnable.run(); }
}
