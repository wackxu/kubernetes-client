package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNodeSelectorRequirement extends NodeSelectorRequirementFluentImpl<DoneableNodeSelectorRequirement> implements Doneable<NodeSelectorRequirement>{

    private final NodeSelectorRequirementBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NodeSelectorRequirement,NodeSelectorRequirement> function;

    public DoneableNodeSelectorRequirement(io.fabric8.kubernetes.api.builder.Function<NodeSelectorRequirement,NodeSelectorRequirement> function){
            super();this.builder=new NodeSelectorRequirementBuilder(this);this.function=function;
    }
    public DoneableNodeSelectorRequirement(NodeSelectorRequirement item,io.fabric8.kubernetes.api.builder.Function<NodeSelectorRequirement,NodeSelectorRequirement> function){
            super(item);this.builder=new NodeSelectorRequirementBuilder(this, item);this.function=function;
    }
    public DoneableNodeSelectorRequirement(NodeSelectorRequirement item){
            super(item);this.builder=new NodeSelectorRequirementBuilder(this, item);this.function=new Function<NodeSelectorRequirement, NodeSelectorRequirement>() {
    public NodeSelectorRequirement apply(NodeSelectorRequirement item) {
        return item;
    }
}
;
    }

    public NodeSelectorRequirement done(){
             return function.apply(builder.build());
    }




}
