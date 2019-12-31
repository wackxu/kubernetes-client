package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableScopedResourceSelectorRequirement extends ScopedResourceSelectorRequirementFluentImpl<DoneableScopedResourceSelectorRequirement> implements Doneable<ScopedResourceSelectorRequirement>{

    private final ScopedResourceSelectorRequirementBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ScopedResourceSelectorRequirement,ScopedResourceSelectorRequirement> function;

    public DoneableScopedResourceSelectorRequirement(io.fabric8.kubernetes.api.builder.Function<ScopedResourceSelectorRequirement,ScopedResourceSelectorRequirement> function){
            super();this.builder=new ScopedResourceSelectorRequirementBuilder(this);this.function=function;
    }
    public DoneableScopedResourceSelectorRequirement(ScopedResourceSelectorRequirement item,io.fabric8.kubernetes.api.builder.Function<ScopedResourceSelectorRequirement,ScopedResourceSelectorRequirement> function){
            super(item);this.builder=new ScopedResourceSelectorRequirementBuilder(this, item);this.function=function;
    }
    public DoneableScopedResourceSelectorRequirement(ScopedResourceSelectorRequirement item){
            super(item);this.builder=new ScopedResourceSelectorRequirementBuilder(this, item);this.function=new Function<ScopedResourceSelectorRequirement, ScopedResourceSelectorRequirement>() {
    public ScopedResourceSelectorRequirement apply(ScopedResourceSelectorRequirement item) {
        return item;
    }
}
;
    }

    public ScopedResourceSelectorRequirement done(){
             return function.apply(builder.build());
    }




}
