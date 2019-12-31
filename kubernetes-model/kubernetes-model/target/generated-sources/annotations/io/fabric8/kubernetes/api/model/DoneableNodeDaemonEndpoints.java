package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNodeDaemonEndpoints extends NodeDaemonEndpointsFluentImpl<DoneableNodeDaemonEndpoints> implements Doneable<NodeDaemonEndpoints>{

    private final NodeDaemonEndpointsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NodeDaemonEndpoints,NodeDaemonEndpoints> function;

    public DoneableNodeDaemonEndpoints(io.fabric8.kubernetes.api.builder.Function<NodeDaemonEndpoints,NodeDaemonEndpoints> function){
            super();this.builder=new NodeDaemonEndpointsBuilder(this);this.function=function;
    }
    public DoneableNodeDaemonEndpoints(NodeDaemonEndpoints item,io.fabric8.kubernetes.api.builder.Function<NodeDaemonEndpoints,NodeDaemonEndpoints> function){
            super(item);this.builder=new NodeDaemonEndpointsBuilder(this, item);this.function=function;
    }
    public DoneableNodeDaemonEndpoints(NodeDaemonEndpoints item){
            super(item);this.builder=new NodeDaemonEndpointsBuilder(this, item);this.function=new Function<NodeDaemonEndpoints, NodeDaemonEndpoints>() {
    public NodeDaemonEndpoints apply(NodeDaemonEndpoints item) {
        return item;
    }
}
;
    }

    public NodeDaemonEndpoints done(){
             return function.apply(builder.build());
    }




}
