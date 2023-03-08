package com.ibm.config;

// making this final so that it cannot be extended in baseTest
// making private contrcucto so that object is not created in baseTest

public final class ConfigFactory {

    private ConfigFactory(){}

    public static FrameworkConfig getConfig() {
        return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
    }
}

