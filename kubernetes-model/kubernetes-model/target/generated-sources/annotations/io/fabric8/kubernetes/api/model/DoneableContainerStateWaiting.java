package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableContainerStateWaiting extends ContainerStateWaitingFluentImpl<DoneableContainerStateWaiting> implements Doneable<ContainerStateWaiting>{

    private final ContainerStateWaitingBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ContainerStateWaiting,ContainerStateWaiting> function;

    public DoneableContainerStateWaiting(io.fabric8.kubernetes.api.builder.Function<ContainerStateWaiting,ContainerStateWaiting> function){
            super();this.builder=new ContainerStateWaitingBuilder(this);this.function=function;
    }
    public DoneableContainerStateWaiting(ContainerStateWaiting item,io.fabric8.kubernetes.api.builder.Function<ContainerStateWaiting,ContainerStateWaiting> function){
            super(item);this.builder=new ContainerStateWaitingBuilder(this, item);this.function=function;
    }
    public DoneableContainerStateWaiting(ContainerStateWaiting item){
            super(item);this.builder=new ContainerStateWaitingBuilder(this, item);this.function=new Function<ContainerStateWaiting, ContainerStateWaiting>() {
    public ContainerStateWaiting apply(ContainerStateWaiting item) {
        return item;
    }
}
;
    }

    public ContainerStateWaiting done(){
             return function.apply(builder.build());
    }




}
