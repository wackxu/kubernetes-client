package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodReadinessGate extends PodReadinessGateFluentImpl<DoneablePodReadinessGate> implements Doneable<PodReadinessGate>{

    private final PodReadinessGateBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodReadinessGate,PodReadinessGate> function;

    public DoneablePodReadinessGate(io.fabric8.kubernetes.api.builder.Function<PodReadinessGate,PodReadinessGate> function){
            super();this.builder=new PodReadinessGateBuilder(this);this.function=function;
    }
    public DoneablePodReadinessGate(PodReadinessGate item,io.fabric8.kubernetes.api.builder.Function<PodReadinessGate,PodReadinessGate> function){
            super(item);this.builder=new PodReadinessGateBuilder(this, item);this.function=function;
    }
    public DoneablePodReadinessGate(PodReadinessGate item){
            super(item);this.builder=new PodReadinessGateBuilder(this, item);this.function=new Function<PodReadinessGate, PodReadinessGate>() {
    public PodReadinessGate apply(PodReadinessGate item) {
        return item;
    }
}
;
    }

    public PodReadinessGate done(){
             return function.apply(builder.build());
    }




}
