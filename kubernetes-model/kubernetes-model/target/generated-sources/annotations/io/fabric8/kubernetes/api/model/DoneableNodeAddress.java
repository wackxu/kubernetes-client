package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNodeAddress extends NodeAddressFluentImpl<DoneableNodeAddress> implements Doneable<NodeAddress>{

    private final NodeAddressBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NodeAddress,NodeAddress> function;

    public DoneableNodeAddress(io.fabric8.kubernetes.api.builder.Function<NodeAddress,NodeAddress> function){
            super();this.builder=new NodeAddressBuilder(this);this.function=function;
    }
    public DoneableNodeAddress(NodeAddress item,io.fabric8.kubernetes.api.builder.Function<NodeAddress,NodeAddress> function){
            super(item);this.builder=new NodeAddressBuilder(this, item);this.function=function;
    }
    public DoneableNodeAddress(NodeAddress item){
            super(item);this.builder=new NodeAddressBuilder(this, item);this.function=new Function<NodeAddress, NodeAddress>() {
    public NodeAddress apply(NodeAddress item) {
        return item;
    }
}
;
    }

    public NodeAddress done(){
             return function.apply(builder.build());
    }




}
