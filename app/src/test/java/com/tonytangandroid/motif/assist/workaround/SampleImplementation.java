package com.tonytangandroid.motif.assist.workaround;

public class SampleImplementation implements SampleInterface {

    private final DynamicData dynamicData;
    private final Logger logger;

    public SampleImplementation(DynamicData dynamicData, Logger logger) {
        this.dynamicData = dynamicData;
        this.logger = logger;
    }

    @Override
    public DynamicData dynamicData() {
        return dynamicData;
    }
}
