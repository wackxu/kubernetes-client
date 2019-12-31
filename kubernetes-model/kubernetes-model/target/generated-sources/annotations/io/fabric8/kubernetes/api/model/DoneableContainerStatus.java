package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableContainerStatus extends ContainerStatusFluentImpl<DoneableContainerStatus> implements Doneable<ContainerStatus>{

    private final ContainerStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ContainerStatus,ContainerStatus> function;

    public DoneableContainerStatus(io.fabric8.kubernetes.api.builder.Function<ContainerStatus,ContainerStatus> function){
            super();this.builder=new ContainerStatusBuilder(this);this.function=function;
    }
    public DoneableContainerStatus(ContainerStatus item,io.fabric8.kubernetes.api.builder.Function<ContainerStatus,ContainerStatus> function){
            super(item);this.builder=new ContainerStatusBuilder(this, item);this.function=function;
    }
    public DoneableContainerStatus(ContainerStatus item){
            super(item);this.builder=new ContainerStatusBuilder(this, item);this.function=new Function<ContainerStatus, ContainerStatus>() {
    public ContainerStatus apply(ContainerStatus item) {
        return item;
    }
}
;
    }

    public ContainerStatus done(){
             return function.apply(builder.build());
    }




}
