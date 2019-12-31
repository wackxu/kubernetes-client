package io.fabric8.kubernetes.api.model.policy;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneablePodDisruptionBudgetStatus extends PodDisruptionBudgetStatusFluentImpl<DoneablePodDisruptionBudgetStatus> implements Doneable<PodDisruptionBudgetStatus>{

    private final PodDisruptionBudgetStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodDisruptionBudgetStatus,PodDisruptionBudgetStatus> function;

    public DoneablePodDisruptionBudgetStatus(io.fabric8.kubernetes.api.builder.Function<PodDisruptionBudgetStatus,PodDisruptionBudgetStatus> function){
            super();this.builder=new PodDisruptionBudgetStatusBuilder(this);this.function=function;
    }
    public DoneablePodDisruptionBudgetStatus(PodDisruptionBudgetStatus item,io.fabric8.kubernetes.api.builder.Function<PodDisruptionBudgetStatus,PodDisruptionBudgetStatus> function){
            super(item);this.builder=new PodDisruptionBudgetStatusBuilder(this, item);this.function=function;
    }
    public DoneablePodDisruptionBudgetStatus(PodDisruptionBudgetStatus item){
            super(item);this.builder=new PodDisruptionBudgetStatusBuilder(this, item);this.function=new Function<PodDisruptionBudgetStatus, PodDisruptionBudgetStatus>() {
    public PodDisruptionBudgetStatus apply(PodDisruptionBudgetStatus item) {
        return item;
    }
}
;
    }

    public PodDisruptionBudgetStatus done(){
             return function.apply(builder.build());
    }




}
