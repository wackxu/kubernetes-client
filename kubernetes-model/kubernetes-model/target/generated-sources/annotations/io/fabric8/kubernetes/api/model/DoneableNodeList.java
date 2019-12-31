package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNodeList extends NodeListFluentImpl<DoneableNodeList> implements Doneable<NodeList>{

    private final NodeListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NodeList,NodeList> function;

    public DoneableNodeList(io.fabric8.kubernetes.api.builder.Function<NodeList,NodeList> function){
            super();this.builder=new NodeListBuilder(this);this.function=function;
    }
    public DoneableNodeList(NodeList item,io.fabric8.kubernetes.api.builder.Function<NodeList,NodeList> function){
            super(item);this.builder=new NodeListBuilder(this, item);this.function=function;
    }
    public DoneableNodeList(NodeList item){
            super(item);this.builder=new NodeListBuilder(this, item);this.function=new Function<NodeList, NodeList>() {
    public NodeList apply(NodeList item) {
        return item;
    }
}
;
    }

    public NodeList done(){
             return function.apply(builder.build());
    }




}
