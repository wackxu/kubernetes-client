package io.fabric8.kubernetes.api.model.policy;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneablePodDisruptionBudget extends PodDisruptionBudgetFluentImpl<DoneablePodDisruptionBudget> implements Doneable<PodDisruptionBudget>{

    private final PodDisruptionBudgetBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodDisruptionBudget,PodDisruptionBudget> function;

    public DoneablePodDisruptionBudget(io.fabric8.kubernetes.api.builder.Function<PodDisruptionBudget,PodDisruptionBudget> function){
            super();this.builder=new PodDisruptionBudgetBuilder(this);this.function=function;
    }
    public DoneablePodDisruptionBudget(PodDisruptionBudget item,io.fabric8.kubernetes.api.builder.Function<PodDisruptionBudget,PodDisruptionBudget> function){
            super(item);this.builder=new PodDisruptionBudgetBuilder(this, item);this.function=function;
    }
    public DoneablePodDisruptionBudget(PodDisruptionBudget item){
            super(item);this.builder=new PodDisruptionBudgetBuilder(this, item);this.function=new Function<PodDisruptionBudget, PodDisruptionBudget>() {
    public PodDisruptionBudget apply(PodDisruptionBudget item) {
        return item;
    }
}
;
    }

    public PodDisruptionBudget done(){
             return function.apply(builder.build());
    }




}
