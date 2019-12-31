package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDaemonSetStatus extends DaemonSetStatusFluentImpl<DoneableDaemonSetStatus> implements Doneable<DaemonSetStatus>{

    private final DaemonSetStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DaemonSetStatus,DaemonSetStatus> function;

    public DoneableDaemonSetStatus(io.fabric8.kubernetes.api.builder.Function<DaemonSetStatus,DaemonSetStatus> function){
            super();this.builder=new DaemonSetStatusBuilder(this);this.function=function;
    }
    public DoneableDaemonSetStatus(DaemonSetStatus item,io.fabric8.kubernetes.api.builder.Function<DaemonSetStatus,DaemonSetStatus> function){
            super(item);this.builder=new DaemonSetStatusBuilder(this, item);this.function=function;
    }
    public DoneableDaemonSetStatus(DaemonSetStatus item){
            super(item);this.builder=new DaemonSetStatusBuilder(this, item);this.function=new Function<DaemonSetStatus, DaemonSetStatus>() {
    public DaemonSetStatus apply(DaemonSetStatus item) {
        return item;
    }
}
;
    }

    public DaemonSetStatus done(){
             return function.apply(builder.build());
    }




}
