package org.example;

import org.jobrunr.jobs.context.JobContext;
import org.jobrunr.scheduling.BackgroundJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class GeoService {
    Logger LOG = LoggerFactory.getLogger(GeoService.class);

    public void executeGeoTreeJob(JobContext jobContext, long geoNameId, UserId userId) {
        LOG.error("Running: " + geoNameId);
    }

    public void run() {
        LOG.error("Starting job");
        UserId userId = new UserId();
        userId.setValue("test");
        long geoNameId = 1234;
        BackgroundJob.enqueue(UUID.randomUUID(), () -> executeGeoTreeJob(JobContext.Null, geoNameId, userId));

    }
}
