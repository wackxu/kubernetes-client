package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNodeAffinity extends NodeAffinityFluentImpl<DoneableNodeAffinity> implements Doneable<NodeAffinity>{

    private final NodeAffinityBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NodeAffinity,NodeAffinity> function;

    public DoneableNodeAffinity(io.fabric8.kubernetes.api.builder.Function<NodeAffinity,NodeAffinity> function){
            super();this.builder=new NodeAffinityBuilder(this);this.function=function;
    }
    public DoneableNodeAffinity(NodeAffinity item,io.fabric8.kubernetes.api.builder.Function<NodeAffinity,NodeAffinity> function){
            super(item);this.builder=new NodeAffinityBuilder(this, item);this.function=function;
    }
    public DoneableNodeAffinity(NodeAffinity item){
            super(item);this.builder=new NodeAffinityBuilder(this, item);this.function=new Function<NodeAffinity, NodeAffinity>() {
    public NodeAffinity apply(NodeAffinity item) {
        return item;
    }
}
;
    }

    public NodeAffinity done(){
             return function.apply(builder.build());
    }




}
