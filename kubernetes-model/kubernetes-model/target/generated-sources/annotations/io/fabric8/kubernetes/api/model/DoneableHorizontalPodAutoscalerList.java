package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableHorizontalPodAutoscalerList extends HorizontalPodAutoscalerListFluentImpl<DoneableHorizontalPodAutoscalerList> implements Doneable<HorizontalPodAutoscalerList>{

    private final HorizontalPodAutoscalerListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<HorizontalPodAutoscalerList,HorizontalPodAutoscalerList> function;

    public DoneableHorizontalPodAutoscalerList(io.fabric8.kubernetes.api.builder.Function<HorizontalPodAutoscalerList,HorizontalPodAutoscalerList> function){
            super();this.builder=new HorizontalPodAutoscalerListBuilder(this);this.function=function;
    }
    public DoneableHorizontalPodAutoscalerList(HorizontalPodAutoscalerList item,io.fabric8.kubernetes.api.builder.Function<HorizontalPodAutoscalerList,HorizontalPodAutoscalerList> function){
            super(item);this.builder=new HorizontalPodAutoscalerListBuilder(this, item);this.function=function;
    }
    public DoneableHorizontalPodAutoscalerList(HorizontalPodAutoscalerList item){
            super(item);this.builder=new HorizontalPodAutoscalerListBuilder(this, item);this.function=new Function<HorizontalPodAutoscalerList, HorizontalPodAutoscalerList>() {
    public HorizontalPodAutoscalerList apply(HorizontalPodAutoscalerList item) {
        return item;
    }
}
;
    }

    public HorizontalPodAutoscalerList done(){
             return function.apply(builder.build());
    }




}
