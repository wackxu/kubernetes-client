package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDaemonSet extends DaemonSetFluentImpl<DoneableDaemonSet> implements Doneable<DaemonSet>{

    private final DaemonSetBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DaemonSet,DaemonSet> function;

    public DoneableDaemonSet(io.fabric8.kubernetes.api.builder.Function<DaemonSet,DaemonSet> function){
            super();this.builder=new DaemonSetBuilder(this);this.function=function;
    }
    public DoneableDaemonSet(DaemonSet item,io.fabric8.kubernetes.api.builder.Function<DaemonSet,DaemonSet> function){
            super(item);this.builder=new DaemonSetBuilder(this, item);this.function=function;
    }
    public DoneableDaemonSet(DaemonSet item){
            super(item);this.builder=new DaemonSetBuilder(this, item);this.function=new Function<DaemonSet, DaemonSet>() {
    public DaemonSet apply(DaemonSet item) {
        return item;
    }
}
;
    }

    public DaemonSet done(){
             return function.apply(builder.build());
    }




}
