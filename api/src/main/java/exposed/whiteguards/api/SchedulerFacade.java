package exposed.whiteguards.api;

public interface SchedulerFacade {
    void runGlobal(Runnable task);
    void runAsync(Runnable task);
    void runAtRegion(double x, double y, double z, String world, Runnable task);
    void runOnEntity(java.util.UUID entityId, Runnable task);
}

