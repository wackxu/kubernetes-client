package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableStatefulSetSpec extends StatefulSetSpecFluentImpl<DoneableStatefulSetSpec> implements Doneable<StatefulSetSpec>{

    private final StatefulSetSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<StatefulSetSpec,StatefulSetSpec> function;

    public DoneableStatefulSetSpec(io.fabric8.kubernetes.api.builder.Function<StatefulSetSpec,StatefulSetSpec> function){
            super();this.builder=new StatefulSetSpecBuilder(this);this.function=function;
    }
    public DoneableStatefulSetSpec(StatefulSetSpec item,io.fabric8.kubernetes.api.builder.Function<StatefulSetSpec,StatefulSetSpec> function){
            super(item);this.builder=new StatefulSetSpecBuilder(this, item);this.function=function;
    }
    public DoneableStatefulSetSpec(StatefulSetSpec item){
            super(item);this.builder=new StatefulSetSpecBuilder(this, item);this.function=new Function<StatefulSetSpec, StatefulSetSpec>() {
    public StatefulSetSpec apply(StatefulSetSpec item) {
        return item;
    }
}
;
    }

    public StatefulSetSpec done(){
             return function.apply(builder.build());
    }




}
