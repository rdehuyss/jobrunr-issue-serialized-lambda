package org.example;
import org.jobrunr.configuration.JobRunr;
import org.jobrunr.jobs.details.JobDetailsAsmGenerator;
import org.jobrunr.storage.InMemoryStorageProvider;

import java.util.UUID;


public class Main {
    public static void main(String[] args) {
        JobRunr.configure()
                .useStorageProvider(new InMemoryStorageProvider())
                .useBackgroundJobServer()
                .initialize();

        System.out.println("Running GeoService");
        System.out.println("Java version " + System.getProperty("java.version"));
        new GeoService().run();
    }


}