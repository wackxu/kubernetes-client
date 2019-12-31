package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableExternalMetricSource extends ExternalMetricSourceFluentImpl<DoneableExternalMetricSource> implements Doneable<ExternalMetricSource>{

    private final ExternalMetricSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ExternalMetricSource,ExternalMetricSource> function;

    public DoneableExternalMetricSource(io.fabric8.kubernetes.api.builder.Function<ExternalMetricSource,ExternalMetricSource> function){
            super();this.builder=new ExternalMetricSourceBuilder(this);this.function=function;
    }
    public DoneableExternalMetricSource(ExternalMetricSource item,io.fabric8.kubernetes.api.builder.Function<ExternalMetricSource,ExternalMetricSource> function){
            super(item);this.builder=new ExternalMetricSourceBuilder(this, item);this.function=function;
    }
    public DoneableExternalMetricSource(ExternalMetricSource item){
            super(item);this.builder=new ExternalMetricSourceBuilder(this, item);this.function=new Function<ExternalMetricSource, ExternalMetricSource>() {
    public ExternalMetricSource apply(ExternalMetricSource item) {
        return item;
    }
}
;
    }

    public ExternalMetricSource done(){
             return function.apply(builder.build());
    }




}
