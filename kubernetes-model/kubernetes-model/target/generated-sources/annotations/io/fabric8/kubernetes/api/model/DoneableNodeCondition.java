package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNodeCondition extends NodeConditionFluentImpl<DoneableNodeCondition> implements Doneable<NodeCondition>{

    private final NodeConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NodeCondition,NodeCondition> function;

    public DoneableNodeCondition(io.fabric8.kubernetes.api.builder.Function<NodeCondition,NodeCondition> function){
            super();this.builder=new NodeConditionBuilder(this);this.function=function;
    }
    public DoneableNodeCondition(NodeCondition item,io.fabric8.kubernetes.api.builder.Function<NodeCondition,NodeCondition> function){
            super(item);this.builder=new NodeConditionBuilder(this, item);this.function=function;
    }
    public DoneableNodeCondition(NodeCondition item){
            super(item);this.builder=new NodeConditionBuilder(this, item);this.function=new Function<NodeCondition, NodeCondition>() {
    public NodeCondition apply(NodeCondition item) {
        return item;
    }
}
;
    }

    public NodeCondition done(){
             return function.apply(builder.build());
    }




}
