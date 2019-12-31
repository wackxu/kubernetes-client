package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableResourceMetricStatus extends ResourceMetricStatusFluentImpl<DoneableResourceMetricStatus> implements Doneable<ResourceMetricStatus>{

    private final ResourceMetricStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ResourceMetricStatus,ResourceMetricStatus> function;

    public DoneableResourceMetricStatus(io.fabric8.kubernetes.api.builder.Function<ResourceMetricStatus,ResourceMetricStatus> function){
            super();this.builder=new ResourceMetricStatusBuilder(this);this.function=function;
    }
    public DoneableResourceMetricStatus(ResourceMetricStatus item,io.fabric8.kubernetes.api.builder.Function<ResourceMetricStatus,ResourceMetricStatus> function){
            super(item);this.builder=new ResourceMetricStatusBuilder(this, item);this.function=function;
    }
    public DoneableResourceMetricStatus(ResourceMetricStatus item){
            super(item);this.builder=new ResourceMetricStatusBuilder(this, item);this.function=new Function<ResourceMetricStatus, ResourceMetricStatus>() {
    public ResourceMetricStatus apply(ResourceMetricStatus item) {
        return item;
    }
}
;
    }

    public ResourceMetricStatus done(){
             return function.apply(builder.build());
    }




}
