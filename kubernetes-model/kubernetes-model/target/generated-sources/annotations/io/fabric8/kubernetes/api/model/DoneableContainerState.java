package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableContainerState extends ContainerStateFluentImpl<DoneableContainerState> implements Doneable<ContainerState>{

    private final ContainerStateBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ContainerState,ContainerState> function;

    public DoneableContainerState(io.fabric8.kubernetes.api.builder.Function<ContainerState,ContainerState> function){
            super();this.builder=new ContainerStateBuilder(this);this.function=function;
    }
    public DoneableContainerState(ContainerState item,io.fabric8.kubernetes.api.builder.Function<ContainerState,ContainerState> function){
            super(item);this.builder=new ContainerStateBuilder(this, item);this.function=function;
    }
    public DoneableContainerState(ContainerState item){
            super(item);this.builder=new ContainerStateBuilder(this, item);this.function=new Function<ContainerState, ContainerState>() {
    public ContainerState apply(ContainerState item) {
        return item;
    }
}
;
    }

    public ContainerState done(){
             return function.apply(builder.build());
    }




}
