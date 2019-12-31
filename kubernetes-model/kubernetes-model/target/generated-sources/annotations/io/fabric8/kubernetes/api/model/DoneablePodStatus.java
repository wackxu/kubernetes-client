package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodStatus extends PodStatusFluentImpl<DoneablePodStatus> implements Doneable<PodStatus>{

    private final PodStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodStatus,PodStatus> function;

    public DoneablePodStatus(io.fabric8.kubernetes.api.builder.Function<PodStatus,PodStatus> function){
            super();this.builder=new PodStatusBuilder(this);this.function=function;
    }
    public DoneablePodStatus(PodStatus item,io.fabric8.kubernetes.api.builder.Function<PodStatus,PodStatus> function){
            super(item);this.builder=new PodStatusBuilder(this, item);this.function=function;
    }
    public DoneablePodStatus(PodStatus item){
            super(item);this.builder=new PodStatusBuilder(this, item);this.function=new Function<PodStatus, PodStatus>() {
    public PodStatus apply(PodStatus item) {
        return item;
    }
}
;
    }

    public PodStatus done(){
             return function.apply(builder.build());
    }




}
