package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNodeSelectorTerm extends NodeSelectorTermFluentImpl<DoneableNodeSelectorTerm> implements Doneable<NodeSelectorTerm>{

    private final NodeSelectorTermBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NodeSelectorTerm,NodeSelectorTerm> function;

    public DoneableNodeSelectorTerm(io.fabric8.kubernetes.api.builder.Function<NodeSelectorTerm,NodeSelectorTerm> function){
            super();this.builder=new NodeSelectorTermBuilder(this);this.function=function;
    }
    public DoneableNodeSelectorTerm(NodeSelectorTerm item,io.fabric8.kubernetes.api.builder.Function<NodeSelectorTerm,NodeSelectorTerm> function){
            super(item);this.builder=new NodeSelectorTermBuilder(this, item);this.function=function;
    }
    public DoneableNodeSelectorTerm(NodeSelectorTerm item){
            super(item);this.builder=new NodeSelectorTermBuilder(this, item);this.function=new Function<NodeSelectorTerm, NodeSelectorTerm>() {
    public NodeSelectorTerm apply(NodeSelectorTerm item) {
        return item;
    }
}
;
    }

    public NodeSelectorTerm done(){
             return function.apply(builder.build());
    }




}
