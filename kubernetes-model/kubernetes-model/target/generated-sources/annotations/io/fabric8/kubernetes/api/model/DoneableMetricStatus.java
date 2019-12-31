package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableMetricStatus extends MetricStatusFluentImpl<DoneableMetricStatus> implements Doneable<MetricStatus>{

    private final MetricStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<MetricStatus,MetricStatus> function;

    public DoneableMetricStatus(io.fabric8.kubernetes.api.builder.Function<MetricStatus,MetricStatus> function){
            super();this.builder=new MetricStatusBuilder(this);this.function=function;
    }
    public DoneableMetricStatus(MetricStatus item,io.fabric8.kubernetes.api.builder.Function<MetricStatus,MetricStatus> function){
            super(item);this.builder=new MetricStatusBuilder(this, item);this.function=function;
    }
    public DoneableMetricStatus(MetricStatus item){
            super(item);this.builder=new MetricStatusBuilder(this, item);this.function=new Function<MetricStatus, MetricStatus>() {
    public MetricStatus apply(MetricStatus item) {
        return item;
    }
}
;
    }

    public MetricStatus done(){
             return function.apply(builder.build());
    }




}
