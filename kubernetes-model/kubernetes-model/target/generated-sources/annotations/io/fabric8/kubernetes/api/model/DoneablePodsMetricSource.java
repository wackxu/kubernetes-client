package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodsMetricSource extends PodsMetricSourceFluentImpl<DoneablePodsMetricSource> implements Doneable<PodsMetricSource>{

    private final PodsMetricSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodsMetricSource,PodsMetricSource> function;

    public DoneablePodsMetricSource(io.fabric8.kubernetes.api.builder.Function<PodsMetricSource,PodsMetricSource> function){
            super();this.builder=new PodsMetricSourceBuilder(this);this.function=function;
    }
    public DoneablePodsMetricSource(PodsMetricSource item,io.fabric8.kubernetes.api.builder.Function<PodsMetricSource,PodsMetricSource> function){
            super(item);this.builder=new PodsMetricSourceBuilder(this, item);this.function=function;
    }
    public DoneablePodsMetricSource(PodsMetricSource item){
            super(item);this.builder=new PodsMetricSourceBuilder(this, item);this.function=new Function<PodsMetricSource, PodsMetricSource>() {
    public PodsMetricSource apply(PodsMetricSource item) {
        return item;
    }
}
;
    }

    public PodsMetricSource done(){
             return function.apply(builder.build());
    }




}
