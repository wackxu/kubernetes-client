package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableResourceMetricSource extends ResourceMetricSourceFluentImpl<DoneableResourceMetricSource> implements Doneable<ResourceMetricSource>{

    private final ResourceMetricSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ResourceMetricSource,ResourceMetricSource> function;

    public DoneableResourceMetricSource(io.fabric8.kubernetes.api.builder.Function<ResourceMetricSource,ResourceMetricSource> function){
            super();this.builder=new ResourceMetricSourceBuilder(this);this.function=function;
    }
    public DoneableResourceMetricSource(ResourceMetricSource item,io.fabric8.kubernetes.api.builder.Function<ResourceMetricSource,ResourceMetricSource> function){
            super(item);this.builder=new ResourceMetricSourceBuilder(this, item);this.function=function;
    }
    public DoneableResourceMetricSource(ResourceMetricSource item){
            super(item);this.builder=new ResourceMetricSourceBuilder(this, item);this.function=new Function<ResourceMetricSource, ResourceMetricSource>() {
    public ResourceMetricSource apply(ResourceMetricSource item) {
        return item;
    }
}
;
    }

    public ResourceMetricSource done(){
             return function.apply(builder.build());
    }




}
