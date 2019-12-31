package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableObjectMetricStatus extends ObjectMetricStatusFluentImpl<DoneableObjectMetricStatus> implements Doneable<ObjectMetricStatus>{

    private final ObjectMetricStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ObjectMetricStatus,ObjectMetricStatus> function;

    public DoneableObjectMetricStatus(io.fabric8.kubernetes.api.builder.Function<ObjectMetricStatus,ObjectMetricStatus> function){
            super();this.builder=new ObjectMetricStatusBuilder(this);this.function=function;
    }
    public DoneableObjectMetricStatus(ObjectMetricStatus item,io.fabric8.kubernetes.api.builder.Function<ObjectMetricStatus,ObjectMetricStatus> function){
            super(item);this.builder=new ObjectMetricStatusBuilder(this, item);this.function=function;
    }
    public DoneableObjectMetricStatus(ObjectMetricStatus item){
            super(item);this.builder=new ObjectMetricStatusBuilder(this, item);this.function=new Function<ObjectMetricStatus, ObjectMetricStatus>() {
    public ObjectMetricStatus apply(ObjectMetricStatus item) {
        return item;
    }
}
;
    }

    public ObjectMetricStatus done(){
             return function.apply(builder.build());
    }




}
