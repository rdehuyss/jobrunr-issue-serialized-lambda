package org.example;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jobrunr.jobs.context.JobContext;

import java.io.Serializable;

public class UserId implements Serializable, JobContext.Metadata {

    public UserId() {

    }

    public UserId(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;
}