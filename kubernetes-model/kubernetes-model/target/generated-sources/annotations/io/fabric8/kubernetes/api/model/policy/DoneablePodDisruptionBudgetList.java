package io.fabric8.kubernetes.api.model.policy;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneablePodDisruptionBudgetList extends PodDisruptionBudgetListFluentImpl<DoneablePodDisruptionBudgetList> implements Doneable<PodDisruptionBudgetList>{

    private final PodDisruptionBudgetListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodDisruptionBudgetList,PodDisruptionBudgetList> function;

    public DoneablePodDisruptionBudgetList(io.fabric8.kubernetes.api.builder.Function<PodDisruptionBudgetList,PodDisruptionBudgetList> function){
            super();this.builder=new PodDisruptionBudgetListBuilder(this);this.function=function;
    }
    public DoneablePodDisruptionBudgetList(PodDisruptionBudgetList item,io.fabric8.kubernetes.api.builder.Function<PodDisruptionBudgetList,PodDisruptionBudgetList> function){
            super(item);this.builder=new PodDisruptionBudgetListBuilder(this, item);this.function=function;
    }
    public DoneablePodDisruptionBudgetList(PodDisruptionBudgetList item){
            super(item);this.builder=new PodDisruptionBudgetListBuilder(this, item);this.function=new Function<PodDisruptionBudgetList, PodDisruptionBudgetList>() {
    public PodDisruptionBudgetList apply(PodDisruptionBudgetList item) {
        return item;
    }
}
;
    }

    public PodDisruptionBudgetList done(){
             return function.apply(builder.build());
    }




}
