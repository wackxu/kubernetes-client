package io.fabric8.kubernetes.api.model.policy;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneablePodDisruptionBudgetSpec extends PodDisruptionBudgetSpecFluentImpl<DoneablePodDisruptionBudgetSpec> implements Doneable<PodDisruptionBudgetSpec>{

    private final PodDisruptionBudgetSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodDisruptionBudgetSpec,PodDisruptionBudgetSpec> function;

    public DoneablePodDisruptionBudgetSpec(io.fabric8.kubernetes.api.builder.Function<PodDisruptionBudgetSpec,PodDisruptionBudgetSpec> function){
            super();this.builder=new PodDisruptionBudgetSpecBuilder(this);this.function=function;
    }
    public DoneablePodDisruptionBudgetSpec(PodDisruptionBudgetSpec item,io.fabric8.kubernetes.api.builder.Function<PodDisruptionBudgetSpec,PodDisruptionBudgetSpec> function){
            super(item);this.builder=new PodDisruptionBudgetSpecBuilder(this, item);this.function=function;
    }
    public DoneablePodDisruptionBudgetSpec(PodDisruptionBudgetSpec item){
            super(item);this.builder=new PodDisruptionBudgetSpecBuilder(this, item);this.function=new Function<PodDisruptionBudgetSpec, PodDisruptionBudgetSpec>() {
    public PodDisruptionBudgetSpec apply(PodDisruptionBudgetSpec item) {
        return item;
    }
}
;
    }

    public PodDisruptionBudgetSpec done(){
             return function.apply(builder.build());
    }




}
