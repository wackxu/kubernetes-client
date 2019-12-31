package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableHorizontalPodAutoscalerStatus extends HorizontalPodAutoscalerStatusFluentImpl<DoneableHorizontalPodAutoscalerStatus> implements Doneable<HorizontalPodAutoscalerStatus>{

    private final HorizontalPodAutoscalerStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<HorizontalPodAutoscalerStatus,HorizontalPodAutoscalerStatus> function;

    public DoneableHorizontalPodAutoscalerStatus(io.fabric8.kubernetes.api.builder.Function<HorizontalPodAutoscalerStatus,HorizontalPodAutoscalerStatus> function){
            super();this.builder=new HorizontalPodAutoscalerStatusBuilder(this);this.function=function;
    }
    public DoneableHorizontalPodAutoscalerStatus(HorizontalPodAutoscalerStatus item,io.fabric8.kubernetes.api.builder.Function<HorizontalPodAutoscalerStatus,HorizontalPodAutoscalerStatus> function){
            super(item);this.builder=new HorizontalPodAutoscalerStatusBuilder(this, item);this.function=function;
    }
    public DoneableHorizontalPodAutoscalerStatus(HorizontalPodAutoscalerStatus item){
            super(item);this.builder=new HorizontalPodAutoscalerStatusBuilder(this, item);this.function=new Function<HorizontalPodAutoscalerStatus, HorizontalPodAutoscalerStatus>() {
    public HorizontalPodAutoscalerStatus apply(HorizontalPodAutoscalerStatus item) {
        return item;
    }
}
;
    }

    public HorizontalPodAutoscalerStatus done(){
             return function.apply(builder.build());
    }




}
