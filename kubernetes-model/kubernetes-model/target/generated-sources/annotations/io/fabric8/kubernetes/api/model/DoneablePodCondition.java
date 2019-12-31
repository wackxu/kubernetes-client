package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodCondition extends PodConditionFluentImpl<DoneablePodCondition> implements Doneable<PodCondition>{

    private final PodConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodCondition,PodCondition> function;

    public DoneablePodCondition(io.fabric8.kubernetes.api.builder.Function<PodCondition,PodCondition> function){
            super();this.builder=new PodConditionBuilder(this);this.function=function;
    }
    public DoneablePodCondition(PodCondition item,io.fabric8.kubernetes.api.builder.Function<PodCondition,PodCondition> function){
            super(item);this.builder=new PodConditionBuilder(this, item);this.function=function;
    }
    public DoneablePodCondition(PodCondition item){
            super(item);this.builder=new PodConditionBuilder(this, item);this.function=new Function<PodCondition, PodCondition>() {
    public PodCondition apply(PodCondition item) {
        return item;
    }
}
;
    }

    public PodCondition done(){
             return function.apply(builder.build());
    }




}
