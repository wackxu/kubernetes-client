package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNodeSelector extends NodeSelectorFluentImpl<DoneableNodeSelector> implements Doneable<NodeSelector>{

    private final NodeSelectorBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NodeSelector,NodeSelector> function;

    public DoneableNodeSelector(io.fabric8.kubernetes.api.builder.Function<NodeSelector,NodeSelector> function){
            super();this.builder=new NodeSelectorBuilder(this);this.function=function;
    }
    public DoneableNodeSelector(NodeSelector item,io.fabric8.kubernetes.api.builder.Function<NodeSelector,NodeSelector> function){
            super(item);this.builder=new NodeSelectorBuilder(this, item);this.function=function;
    }
    public DoneableNodeSelector(NodeSelector item){
            super(item);this.builder=new NodeSelectorBuilder(this, item);this.function=new Function<NodeSelector, NodeSelector>() {
    public NodeSelector apply(NodeSelector item) {
        return item;
    }
}
;
    }

    public NodeSelector done(){
             return function.apply(builder.build());
    }




}
