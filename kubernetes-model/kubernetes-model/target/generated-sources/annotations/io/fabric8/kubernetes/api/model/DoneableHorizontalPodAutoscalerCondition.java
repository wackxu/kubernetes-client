package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableHorizontalPodAutoscalerCondition extends HorizontalPodAutoscalerConditionFluentImpl<DoneableHorizontalPodAutoscalerCondition> implements Doneable<HorizontalPodAutoscalerCondition>{

    private final HorizontalPodAutoscalerConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<HorizontalPodAutoscalerCondition,HorizontalPodAutoscalerCondition> function;

    public DoneableHorizontalPodAutoscalerCondition(io.fabric8.kubernetes.api.builder.Function<HorizontalPodAutoscalerCondition,HorizontalPodAutoscalerCondition> function){
            super();this.builder=new HorizontalPodAutoscalerConditionBuilder(this);this.function=function;
    }
    public DoneableHorizontalPodAutoscalerCondition(HorizontalPodAutoscalerCondition item,io.fabric8.kubernetes.api.builder.Function<HorizontalPodAutoscalerCondition,HorizontalPodAutoscalerCondition> function){
            super(item);this.builder=new HorizontalPodAutoscalerConditionBuilder(this, item);this.function=function;
    }
    public DoneableHorizontalPodAutoscalerCondition(HorizontalPodAutoscalerCondition item){
            super(item);this.builder=new HorizontalPodAutoscalerConditionBuilder(this, item);this.function=new Function<HorizontalPodAutoscalerCondition, HorizontalPodAutoscalerCondition>() {
    public HorizontalPodAutoscalerCondition apply(HorizontalPodAutoscalerCondition item) {
        return item;
    }
}
;
    }

    public HorizontalPodAutoscalerCondition done(){
             return function.apply(builder.build());
    }




}
