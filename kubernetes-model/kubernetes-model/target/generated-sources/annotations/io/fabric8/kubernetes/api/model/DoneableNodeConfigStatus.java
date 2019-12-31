package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNodeConfigStatus extends NodeConfigStatusFluentImpl<DoneableNodeConfigStatus> implements Doneable<NodeConfigStatus>{

    private final NodeConfigStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NodeConfigStatus,NodeConfigStatus> function;

    public DoneableNodeConfigStatus(io.fabric8.kubernetes.api.builder.Function<NodeConfigStatus,NodeConfigStatus> function){
            super();this.builder=new NodeConfigStatusBuilder(this);this.function=function;
    }
    public DoneableNodeConfigStatus(NodeConfigStatus item,io.fabric8.kubernetes.api.builder.Function<NodeConfigStatus,NodeConfigStatus> function){
            super(item);this.builder=new NodeConfigStatusBuilder(this, item);this.function=function;
    }
    public DoneableNodeConfigStatus(NodeConfigStatus item){
            super(item);this.builder=new NodeConfigStatusBuilder(this, item);this.function=new Function<NodeConfigStatus, NodeConfigStatus>() {
    public NodeConfigStatus apply(NodeConfigStatus item) {
        return item;
    }
}
;
    }

    public NodeConfigStatus done(){
             return function.apply(builder.build());
    }




}
