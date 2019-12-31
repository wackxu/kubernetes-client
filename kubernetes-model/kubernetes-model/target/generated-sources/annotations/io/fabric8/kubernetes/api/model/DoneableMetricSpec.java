package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableMetricSpec extends MetricSpecFluentImpl<DoneableMetricSpec> implements Doneable<MetricSpec>{

    private final MetricSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<MetricSpec,MetricSpec> function;

    public DoneableMetricSpec(io.fabric8.kubernetes.api.builder.Function<MetricSpec,MetricSpec> function){
            super();this.builder=new MetricSpecBuilder(this);this.function=function;
    }
    public DoneableMetricSpec(MetricSpec item,io.fabric8.kubernetes.api.builder.Function<MetricSpec,MetricSpec> function){
            super(item);this.builder=new MetricSpecBuilder(this, item);this.function=function;
    }
    public DoneableMetricSpec(MetricSpec item){
            super(item);this.builder=new MetricSpecBuilder(this, item);this.function=new Function<MetricSpec, MetricSpec>() {
    public MetricSpec apply(MetricSpec item) {
        return item;
    }
}
;
    }

    public MetricSpec done(){
             return function.apply(builder.build());
    }




}
