package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableObjectMetricSource extends ObjectMetricSourceFluentImpl<DoneableObjectMetricSource> implements Doneable<ObjectMetricSource>{

    private final ObjectMetricSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ObjectMetricSource,ObjectMetricSource> function;

    public DoneableObjectMetricSource(io.fabric8.kubernetes.api.builder.Function<ObjectMetricSource,ObjectMetricSource> function){
            super();this.builder=new ObjectMetricSourceBuilder(this);this.function=function;
    }
    public DoneableObjectMetricSource(ObjectMetricSource item,io.fabric8.kubernetes.api.builder.Function<ObjectMetricSource,ObjectMetricSource> function){
            super(item);this.builder=new ObjectMetricSourceBuilder(this, item);this.function=function;
    }
    public DoneableObjectMetricSource(ObjectMetricSource item){
            super(item);this.builder=new ObjectMetricSourceBuilder(this, item);this.function=new Function<ObjectMetricSource, ObjectMetricSource>() {
    public ObjectMetricSource apply(ObjectMetricSource item) {
        return item;
    }
}
;
    }

    public ObjectMetricSource done(){
             return function.apply(builder.build());
    }




}
