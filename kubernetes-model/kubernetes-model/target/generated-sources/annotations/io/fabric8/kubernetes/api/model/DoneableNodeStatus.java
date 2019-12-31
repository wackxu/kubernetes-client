package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNodeStatus extends NodeStatusFluentImpl<DoneableNodeStatus> implements Doneable<NodeStatus>{

    private final NodeStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NodeStatus,NodeStatus> function;

    public DoneableNodeStatus(io.fabric8.kubernetes.api.builder.Function<NodeStatus,NodeStatus> function){
            super();this.builder=new NodeStatusBuilder(this);this.function=function;
    }
    public DoneableNodeStatus(NodeStatus item,io.fabric8.kubernetes.api.builder.Function<NodeStatus,NodeStatus> function){
            super(item);this.builder=new NodeStatusBuilder(this, item);this.function=function;
    }
    public DoneableNodeStatus(NodeStatus item){
            super(item);this.builder=new NodeStatusBuilder(this, item);this.function=new Function<NodeStatus, NodeStatus>() {
    public NodeStatus apply(NodeStatus item) {
        return item;
    }
}
;
    }

    public NodeStatus done(){
             return function.apply(builder.build());
    }




}
