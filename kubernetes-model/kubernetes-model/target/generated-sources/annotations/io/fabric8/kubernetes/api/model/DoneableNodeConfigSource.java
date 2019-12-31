package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNodeConfigSource extends NodeConfigSourceFluentImpl<DoneableNodeConfigSource> implements Doneable<NodeConfigSource>{

    private final NodeConfigSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NodeConfigSource,NodeConfigSource> function;

    public DoneableNodeConfigSource(io.fabric8.kubernetes.api.builder.Function<NodeConfigSource,NodeConfigSource> function){
            super();this.builder=new NodeConfigSourceBuilder(this);this.function=function;
    }
    public DoneableNodeConfigSource(NodeConfigSource item,io.fabric8.kubernetes.api.builder.Function<NodeConfigSource,NodeConfigSource> function){
            super(item);this.builder=new NodeConfigSourceBuilder(this, item);this.function=function;
    }
    public DoneableNodeConfigSource(NodeConfigSource item){
            super(item);this.builder=new NodeConfigSourceBuilder(this, item);this.function=new Function<NodeConfigSource, NodeConfigSource>() {
    public NodeConfigSource apply(NodeConfigSource item) {
        return item;
    }
}
;
    }

    public NodeConfigSource done(){
             return function.apply(builder.build());
    }




}
