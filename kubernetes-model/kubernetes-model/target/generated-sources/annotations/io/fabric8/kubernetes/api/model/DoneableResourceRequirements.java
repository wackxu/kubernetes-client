package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableResourceRequirements extends ResourceRequirementsFluentImpl<DoneableResourceRequirements> implements Doneable<ResourceRequirements>{

    private final ResourceRequirementsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ResourceRequirements,ResourceRequirements> function;

    public DoneableResourceRequirements(io.fabric8.kubernetes.api.builder.Function<ResourceRequirements,ResourceRequirements> function){
            super();this.builder=new ResourceRequirementsBuilder(this);this.function=function;
    }
    public DoneableResourceRequirements(ResourceRequirements item,io.fabric8.kubernetes.api.builder.Function<ResourceRequirements,ResourceRequirements> function){
            super(item);this.builder=new ResourceRequirementsBuilder(this, item);this.function=function;
    }
    public DoneableResourceRequirements(ResourceRequirements item){
            super(item);this.builder=new ResourceRequirementsBuilder(this, item);this.function=new Function<ResourceRequirements, ResourceRequirements>() {
    public ResourceRequirements apply(ResourceRequirements item) {
        return item;
    }
}
;
    }

    public ResourceRequirements done(){
             return function.apply(builder.build());
    }




}
