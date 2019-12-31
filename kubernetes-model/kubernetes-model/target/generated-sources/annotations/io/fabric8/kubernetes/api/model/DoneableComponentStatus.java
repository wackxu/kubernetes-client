package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableComponentStatus extends ComponentStatusFluentImpl<DoneableComponentStatus> implements Doneable<ComponentStatus>{

    private final ComponentStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ComponentStatus,ComponentStatus> function;

    public DoneableComponentStatus(io.fabric8.kubernetes.api.builder.Function<ComponentStatus,ComponentStatus> function){
            super();this.builder=new ComponentStatusBuilder(this);this.function=function;
    }
    public DoneableComponentStatus(ComponentStatus item,io.fabric8.kubernetes.api.builder.Function<ComponentStatus,ComponentStatus> function){
            super(item);this.builder=new ComponentStatusBuilder(this, item);this.function=function;
    }
    public DoneableComponentStatus(ComponentStatus item){
            super(item);this.builder=new ComponentStatusBuilder(this, item);this.function=new Function<ComponentStatus, ComponentStatus>() {
    public ComponentStatus apply(ComponentStatus item) {
        return item;
    }
}
;
    }

    public ComponentStatus done(){
             return function.apply(builder.build());
    }




}
