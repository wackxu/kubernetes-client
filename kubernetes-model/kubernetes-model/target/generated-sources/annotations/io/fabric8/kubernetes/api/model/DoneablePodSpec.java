package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodSpec extends PodSpecFluentImpl<DoneablePodSpec> implements Doneable<PodSpec>{

    private final PodSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodSpec,PodSpec> function;

    public DoneablePodSpec(io.fabric8.kubernetes.api.builder.Function<PodSpec,PodSpec> function){
            super();this.builder=new PodSpecBuilder(this);this.function=function;
    }
    public DoneablePodSpec(PodSpec item,io.fabric8.kubernetes.api.builder.Function<PodSpec,PodSpec> function){
            super(item);this.builder=new PodSpecBuilder(this, item);this.function=function;
    }
    public DoneablePodSpec(PodSpec item){
            super(item);this.builder=new PodSpecBuilder(this, item);this.function=new Function<PodSpec, PodSpec>() {
    public PodSpec apply(PodSpec item) {
        return item;
    }
}
;
    }

    public PodSpec done(){
             return function.apply(builder.build());
    }




}
