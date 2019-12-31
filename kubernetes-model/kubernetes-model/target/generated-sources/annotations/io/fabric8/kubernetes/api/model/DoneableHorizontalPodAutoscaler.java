package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableHorizontalPodAutoscaler extends HorizontalPodAutoscalerFluentImpl<DoneableHorizontalPodAutoscaler> implements Doneable<HorizontalPodAutoscaler>{

    private final HorizontalPodAutoscalerBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<HorizontalPodAutoscaler,HorizontalPodAutoscaler> function;

    public DoneableHorizontalPodAutoscaler(io.fabric8.kubernetes.api.builder.Function<HorizontalPodAutoscaler,HorizontalPodAutoscaler> function){
            super();this.builder=new HorizontalPodAutoscalerBuilder(this);this.function=function;
    }
    public DoneableHorizontalPodAutoscaler(HorizontalPodAutoscaler item,io.fabric8.kubernetes.api.builder.Function<HorizontalPodAutoscaler,HorizontalPodAutoscaler> function){
            super(item);this.builder=new HorizontalPodAutoscalerBuilder(this, item);this.function=function;
    }
    public DoneableHorizontalPodAutoscaler(HorizontalPodAutoscaler item){
            super(item);this.builder=new HorizontalPodAutoscalerBuilder(this, item);this.function=new Function<HorizontalPodAutoscaler, HorizontalPodAutoscaler>() {
    public HorizontalPodAutoscaler apply(HorizontalPodAutoscaler item) {
        return item;
    }
}
;
    }

    public HorizontalPodAutoscaler done(){
             return function.apply(builder.build());
    }




}
