package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodsMetricStatus extends PodsMetricStatusFluentImpl<DoneablePodsMetricStatus> implements Doneable<PodsMetricStatus>{

    private final PodsMetricStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodsMetricStatus,PodsMetricStatus> function;

    public DoneablePodsMetricStatus(io.fabric8.kubernetes.api.builder.Function<PodsMetricStatus,PodsMetricStatus> function){
            super();this.builder=new PodsMetricStatusBuilder(this);this.function=function;
    }
    public DoneablePodsMetricStatus(PodsMetricStatus item,io.fabric8.kubernetes.api.builder.Function<PodsMetricStatus,PodsMetricStatus> function){
            super(item);this.builder=new PodsMetricStatusBuilder(this, item);this.function=function;
    }
    public DoneablePodsMetricStatus(PodsMetricStatus item){
            super(item);this.builder=new PodsMetricStatusBuilder(this, item);this.function=new Function<PodsMetricStatus, PodsMetricStatus>() {
    public PodsMetricStatus apply(PodsMetricStatus item) {
        return item;
    }
}
;
    }

    public PodsMetricStatus done(){
             return function.apply(builder.build());
    }




}
