package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableContainerStateTerminated extends ContainerStateTerminatedFluentImpl<DoneableContainerStateTerminated> implements Doneable<ContainerStateTerminated>{

    private final ContainerStateTerminatedBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ContainerStateTerminated,ContainerStateTerminated> function;

    public DoneableContainerStateTerminated(io.fabric8.kubernetes.api.builder.Function<ContainerStateTerminated,ContainerStateTerminated> function){
            super();this.builder=new ContainerStateTerminatedBuilder(this);this.function=function;
    }
    public DoneableContainerStateTerminated(ContainerStateTerminated item,io.fabric8.kubernetes.api.builder.Function<ContainerStateTerminated,ContainerStateTerminated> function){
            super(item);this.builder=new ContainerStateTerminatedBuilder(this, item);this.function=function;
    }
    public DoneableContainerStateTerminated(ContainerStateTerminated item){
            super(item);this.builder=new ContainerStateTerminatedBuilder(this, item);this.function=new Function<ContainerStateTerminated, ContainerStateTerminated>() {
    public ContainerStateTerminated apply(ContainerStateTerminated item) {
        return item;
    }
}
;
    }

    public ContainerStateTerminated done(){
             return function.apply(builder.build());
    }




}
