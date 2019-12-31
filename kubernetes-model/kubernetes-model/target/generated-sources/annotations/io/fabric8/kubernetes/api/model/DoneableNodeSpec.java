package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNodeSpec extends NodeSpecFluentImpl<DoneableNodeSpec> implements Doneable<NodeSpec>{

    private final NodeSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NodeSpec,NodeSpec> function;

    public DoneableNodeSpec(io.fabric8.kubernetes.api.builder.Function<NodeSpec,NodeSpec> function){
            super();this.builder=new NodeSpecBuilder(this);this.function=function;
    }
    public DoneableNodeSpec(NodeSpec item,io.fabric8.kubernetes.api.builder.Function<NodeSpec,NodeSpec> function){
            super(item);this.builder=new NodeSpecBuilder(this, item);this.function=function;
    }
    public DoneableNodeSpec(NodeSpec item){
            super(item);this.builder=new NodeSpecBuilder(this, item);this.function=new Function<NodeSpec, NodeSpec>() {
    public NodeSpec apply(NodeSpec item) {
        return item;
    }
}
;
    }

    public NodeSpec done(){
             return function.apply(builder.build());
    }




}
