package com.tonytangandroid.motif.assist.workaround;

@motif.Scope
public interface ChildScope {

    SampleInterface sampleInterface();

    @motif.Objects
    abstract class Objects {

        abstract SampleInterface bind(SampleImplementation impl);

        abstract SampleImplementation impl();
    }
}
