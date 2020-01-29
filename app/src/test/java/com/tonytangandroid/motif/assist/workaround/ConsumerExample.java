package com.tonytangandroid.motif.assist.workaround;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class ConsumerExample {
    @Test
    public void build_childScope() {
        DynamicData dynamicData1 = new DynamicData();
        DynamicData dynamicData2 = new DynamicData();
        {
            ChildScope childScope = new SampleScopeImpl().childScope(dynamicData1);
            assertThat(childScope.sampleInterface().dynamicData()).isEqualTo(dynamicData1);
        }

        {
            ChildScope childScope = new SampleScopeImpl().childScope(dynamicData2);
            assertThat(childScope.sampleInterface().dynamicData()).isEqualTo(dynamicData2);
        }
    }
}
