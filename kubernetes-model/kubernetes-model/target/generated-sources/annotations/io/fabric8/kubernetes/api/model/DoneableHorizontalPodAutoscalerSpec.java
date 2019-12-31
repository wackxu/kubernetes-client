package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableHorizontalPodAutoscalerSpec extends HorizontalPodAutoscalerSpecFluentImpl<DoneableHorizontalPodAutoscalerSpec> implements Doneable<HorizontalPodAutoscalerSpec>{

    private final HorizontalPodAutoscalerSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<HorizontalPodAutoscalerSpec,HorizontalPodAutoscalerSpec> function;

    public DoneableHorizontalPodAutoscalerSpec(io.fabric8.kubernetes.api.builder.Function<HorizontalPodAutoscalerSpec,HorizontalPodAutoscalerSpec> function){
            super();this.builder=new HorizontalPodAutoscalerSpecBuilder(this);this.function=function;
    }
    public DoneableHorizontalPodAutoscalerSpec(HorizontalPodAutoscalerSpec item,io.fabric8.kubernetes.api.builder.Function<HorizontalPodAutoscalerSpec,HorizontalPodAutoscalerSpec> function){
            super(item);this.builder=new HorizontalPodAutoscalerSpecBuilder(this, item);this.function=function;
    }
    public DoneableHorizontalPodAutoscalerSpec(HorizontalPodAutoscalerSpec item){
            super(item);this.builder=new HorizontalPodAutoscalerSpecBuilder(this, item);this.function=new Function<HorizontalPodAutoscalerSpec, HorizontalPodAutoscalerSpec>() {
    public HorizontalPodAutoscalerSpec apply(HorizontalPodAutoscalerSpec item) {
        return item;
    }
}
;
    }

    public HorizontalPodAutoscalerSpec done(){
             return function.apply(builder.build());
    }




}
