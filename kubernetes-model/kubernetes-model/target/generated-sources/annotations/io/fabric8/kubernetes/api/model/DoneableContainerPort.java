package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableContainerPort extends ContainerPortFluentImpl<DoneableContainerPort> implements Doneable<ContainerPort>{

    private final ContainerPortBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ContainerPort,ContainerPort> function;

    public DoneableContainerPort(io.fabric8.kubernetes.api.builder.Function<ContainerPort,ContainerPort> function){
            super();this.builder=new ContainerPortBuilder(this);this.function=function;
    }
    public DoneableContainerPort(ContainerPort item,io.fabric8.kubernetes.api.builder.Function<ContainerPort,ContainerPort> function){
            super(item);this.builder=new ContainerPortBuilder(this, item);this.function=function;
    }
    public DoneableContainerPort(ContainerPort item){
            super(item);this.builder=new ContainerPortBuilder(this, item);this.function=new Function<ContainerPort, ContainerPort>() {
    public ContainerPort apply(ContainerPort item) {
        return item;
    }
}
;
    }

    public ContainerPort done(){
             return function.apply(builder.build());
    }




}
