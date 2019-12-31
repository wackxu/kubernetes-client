package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableExternalMetricStatus extends ExternalMetricStatusFluentImpl<DoneableExternalMetricStatus> implements Doneable<ExternalMetricStatus>{

    private final ExternalMetricStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ExternalMetricStatus,ExternalMetricStatus> function;

    public DoneableExternalMetricStatus(io.fabric8.kubernetes.api.builder.Function<ExternalMetricStatus,ExternalMetricStatus> function){
            super();this.builder=new ExternalMetricStatusBuilder(this);this.function=function;
    }
    public DoneableExternalMetricStatus(ExternalMetricStatus item,io.fabric8.kubernetes.api.builder.Function<ExternalMetricStatus,ExternalMetricStatus> function){
            super(item);this.builder=new ExternalMetricStatusBuilder(this, item);this.function=function;
    }
    public DoneableExternalMetricStatus(ExternalMetricStatus item){
            super(item);this.builder=new ExternalMetricStatusBuilder(this, item);this.function=new Function<ExternalMetricStatus, ExternalMetricStatus>() {
    public ExternalMetricStatus apply(ExternalMetricStatus item) {
        return item;
    }
}
;
    }

    public ExternalMetricStatus done(){
             return function.apply(builder.build());
    }




}
