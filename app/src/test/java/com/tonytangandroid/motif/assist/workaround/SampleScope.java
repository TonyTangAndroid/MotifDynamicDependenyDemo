package com.tonytangandroid.motif.assist.workaround;

@motif.Scope
public interface SampleScope {

    ChildScope childScope(DynamicData dynamicData);

    @motif.Objects
    abstract class Objects {

        @motif.Expose
        static Logger loggerFromParent() {
            return new Logger();
        }

    }
}
