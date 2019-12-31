package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableContainerStateRunning extends ContainerStateRunningFluentImpl<DoneableContainerStateRunning> implements Doneable<ContainerStateRunning>{

    private final ContainerStateRunningBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ContainerStateRunning,ContainerStateRunning> function;

    public DoneableContainerStateRunning(io.fabric8.kubernetes.api.builder.Function<ContainerStateRunning,ContainerStateRunning> function){
            super();this.builder=new ContainerStateRunningBuilder(this);this.function=function;
    }
    public DoneableContainerStateRunning(ContainerStateRunning item,io.fabric8.kubernetes.api.builder.Function<ContainerStateRunning,ContainerStateRunning> function){
            super(item);this.builder=new ContainerStateRunningBuilder(this, item);this.function=function;
    }
    public DoneableContainerStateRunning(ContainerStateRunning item){
            super(item);this.builder=new ContainerStateRunningBuilder(this, item);this.function=new Function<ContainerStateRunning, ContainerStateRunning>() {
    public ContainerStateRunning apply(ContainerStateRunning item) {
        return item;
    }
}
;
    }

    public ContainerStateRunning done(){
             return function.apply(builder.build());
    }




}
