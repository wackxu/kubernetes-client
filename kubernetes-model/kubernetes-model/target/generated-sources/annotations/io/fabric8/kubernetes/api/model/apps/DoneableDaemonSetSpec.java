package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDaemonSetSpec extends DaemonSetSpecFluentImpl<DoneableDaemonSetSpec> implements Doneable<DaemonSetSpec>{

    private final DaemonSetSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DaemonSetSpec,DaemonSetSpec> function;

    public DoneableDaemonSetSpec(io.fabric8.kubernetes.api.builder.Function<DaemonSetSpec,DaemonSetSpec> function){
            super();this.builder=new DaemonSetSpecBuilder(this);this.function=function;
    }
    public DoneableDaemonSetSpec(DaemonSetSpec item,io.fabric8.kubernetes.api.builder.Function<DaemonSetSpec,DaemonSetSpec> function){
            super(item);this.builder=new DaemonSetSpecBuilder(this, item);this.function=function;
    }
    public DoneableDaemonSetSpec(DaemonSetSpec item){
            super(item);this.builder=new DaemonSetSpecBuilder(this, item);this.function=new Function<DaemonSetSpec, DaemonSetSpec>() {
    public DaemonSetSpec apply(DaemonSetSpec item) {
        return item;
    }
}
;
    }

    public DaemonSetSpec done(){
             return function.apply(builder.build());
    }




}
