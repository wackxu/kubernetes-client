package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableLabelSelectorRequirement extends LabelSelectorRequirementFluentImpl<DoneableLabelSelectorRequirement> implements Doneable<LabelSelectorRequirement>{

    private final LabelSelectorRequirementBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<LabelSelectorRequirement,LabelSelectorRequirement> function;

    public DoneableLabelSelectorRequirement(io.fabric8.kubernetes.api.builder.Function<LabelSelectorRequirement,LabelSelectorRequirement> function){
            super();this.builder=new LabelSelectorRequirementBuilder(this);this.function=function;
    }
    public DoneableLabelSelectorRequirement(LabelSelectorRequirement item,io.fabric8.kubernetes.api.builder.Function<LabelSelectorRequirement,LabelSelectorRequirement> function){
            super(item);this.builder=new LabelSelectorRequirementBuilder(this, item);this.function=function;
    }
    public DoneableLabelSelectorRequirement(LabelSelectorRequirement item){
            super(item);this.builder=new LabelSelectorRequirementBuilder(this, item);this.function=new Function<LabelSelectorRequirement, LabelSelectorRequirement>() {
    public LabelSelectorRequirement apply(LabelSelectorRequirement item) {
        return item;
    }
}
;
    }

    public LabelSelectorRequirement done(){
             return function.apply(builder.build());
    }




}
