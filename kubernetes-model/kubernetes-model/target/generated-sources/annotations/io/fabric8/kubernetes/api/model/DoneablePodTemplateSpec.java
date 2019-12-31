package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodTemplateSpec extends PodTemplateSpecFluentImpl<DoneablePodTemplateSpec> implements Doneable<PodTemplateSpec>{

    private final PodTemplateSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodTemplateSpec,PodTemplateSpec> function;

    public DoneablePodTemplateSpec(io.fabric8.kubernetes.api.builder.Function<PodTemplateSpec,PodTemplateSpec> function){
            super();this.builder=new PodTemplateSpecBuilder(this);this.function=function;
    }
    public DoneablePodTemplateSpec(PodTemplateSpec item,io.fabric8.kubernetes.api.builder.Function<PodTemplateSpec,PodTemplateSpec> function){
            super(item);this.builder=new PodTemplateSpecBuilder(this, item);this.function=function;
    }
    public DoneablePodTemplateSpec(PodTemplateSpec item){
            super(item);this.builder=new PodTemplateSpecBuilder(this, item);this.function=new Function<PodTemplateSpec, PodTemplateSpec>() {
    public PodTemplateSpec apply(PodTemplateSpec item) {
        return item;
    }
}
;
    }

    public PodTemplateSpec done(){
             return function.apply(builder.build());
    }




}
