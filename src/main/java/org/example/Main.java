package org.example;
import org.jobrunr.configuration.JobRunrPro;
import org.jobrunr.storage.InMemoryStorageProvider;

import java.util.UUID;


public class Main {
    public static void main(String[] args) {
        JobRunrPro.configure()
                .useStorageProvider(new InMemoryStorageProvider())
                .useBackgroundJobServer()
                .initialize();
        new GeoService().run();
    }


}