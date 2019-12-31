package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNode extends NodeFluentImpl<DoneableNode> implements Doneable<Node>{

    private final NodeBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Node,Node> function;

    public DoneableNode(io.fabric8.kubernetes.api.builder.Function<Node,Node> function){
            super();this.builder=new NodeBuilder(this);this.function=function;
    }
    public DoneableNode(Node item,io.fabric8.kubernetes.api.builder.Function<Node,Node> function){
            super(item);this.builder=new NodeBuilder(this, item);this.function=function;
    }
    public DoneableNode(Node item){
            super(item);this.builder=new NodeBuilder(this, item);this.function=new Function<Node, Node>() {
    public Node apply(Node item) {
        return item;
    }
}
;
    }

    public Node done(){
             return function.apply(builder.build());
    }




}
