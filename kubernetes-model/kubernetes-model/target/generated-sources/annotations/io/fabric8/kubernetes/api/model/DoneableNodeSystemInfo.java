package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNodeSystemInfo extends NodeSystemInfoFluentImpl<DoneableNodeSystemInfo> implements Doneable<NodeSystemInfo>{

    private final NodeSystemInfoBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NodeSystemInfo,NodeSystemInfo> function;

    public DoneableNodeSystemInfo(io.fabric8.kubernetes.api.builder.Function<NodeSystemInfo,NodeSystemInfo> function){
            super();this.builder=new NodeSystemInfoBuilder(this);this.function=function;
    }
    public DoneableNodeSystemInfo(NodeSystemInfo item,io.fabric8.kubernetes.api.builder.Function<NodeSystemInfo,NodeSystemInfo> function){
            super(item);this.builder=new NodeSystemInfoBuilder(this, item);this.function=function;
    }
    public DoneableNodeSystemInfo(NodeSystemInfo item){
            super(item);this.builder=new NodeSystemInfoBuilder(this, item);this.function=new Function<NodeSystemInfo, NodeSystemInfo>() {
    public NodeSystemInfo apply(NodeSystemInfo item) {
        return item;
    }
}
;
    }

    public NodeSystemInfo done(){
             return function.apply(builder.build());
    }




}
