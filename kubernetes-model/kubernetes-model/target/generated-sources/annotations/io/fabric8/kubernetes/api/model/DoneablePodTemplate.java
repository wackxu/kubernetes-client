package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodTemplate extends PodTemplateFluentImpl<DoneablePodTemplate> implements Doneable<PodTemplate>{

    private final PodTemplateBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodTemplate,PodTemplate> function;

    public DoneablePodTemplate(io.fabric8.kubernetes.api.builder.Function<PodTemplate,PodTemplate> function){
            super();this.builder=new PodTemplateBuilder(this);this.function=function;
    }
    public DoneablePodTemplate(PodTemplate item,io.fabric8.kubernetes.api.builder.Function<PodTemplate,PodTemplate> function){
            super(item);this.builder=new PodTemplateBuilder(this, item);this.function=function;
    }
    public DoneablePodTemplate(PodTemplate item){
            super(item);this.builder=new PodTemplateBuilder(this, item);this.function=new Function<PodTemplate, PodTemplate>() {
    public PodTemplate apply(PodTemplate item) {
        return item;
    }
}
;
    }

    public PodTemplate done(){
             return function.apply(builder.build());
    }




}
