package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableTopologySelectorLabelRequirement extends TopologySelectorLabelRequirementFluentImpl<DoneableTopologySelectorLabelRequirement> implements Doneable<TopologySelectorLabelRequirement>{

    private final TopologySelectorLabelRequirementBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TopologySelectorLabelRequirement,TopologySelectorLabelRequirement> function;

    public DoneableTopologySelectorLabelRequirement(io.fabric8.kubernetes.api.builder.Function<TopologySelectorLabelRequirement,TopologySelectorLabelRequirement> function){
            super();this.builder=new TopologySelectorLabelRequirementBuilder(this);this.function=function;
    }
    public DoneableTopologySelectorLabelRequirement(TopologySelectorLabelRequirement item,io.fabric8.kubernetes.api.builder.Function<TopologySelectorLabelRequirement,TopologySelectorLabelRequirement> function){
            super(item);this.builder=new TopologySelectorLabelRequirementBuilder(this, item);this.function=function;
    }
    public DoneableTopologySelectorLabelRequirement(TopologySelectorLabelRequirement item){
            super(item);this.builder=new TopologySelectorLabelRequirementBuilder(this, item);this.function=new Function<TopologySelectorLabelRequirement, TopologySelectorLabelRequirement>() {
    public TopologySelectorLabelRequirement apply(TopologySelectorLabelRequirement item) {
        return item;
    }
}
;
    }

    public TopologySelectorLabelRequirement done(){
             return function.apply(builder.build());
    }




}
