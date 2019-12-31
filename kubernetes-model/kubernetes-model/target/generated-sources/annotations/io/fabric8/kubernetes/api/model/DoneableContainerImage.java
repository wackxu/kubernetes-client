package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableContainerImage extends ContainerImageFluentImpl<DoneableContainerImage> implements Doneable<ContainerImage>{

    private final ContainerImageBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ContainerImage,ContainerImage> function;

    public DoneableContainerImage(io.fabric8.kubernetes.api.builder.Function<ContainerImage,ContainerImage> function){
            super();this.builder=new ContainerImageBuilder(this);this.function=function;
    }
    public DoneableContainerImage(ContainerImage item,io.fabric8.kubernetes.api.builder.Function<ContainerImage,ContainerImage> function){
            super(item);this.builder=new ContainerImageBuilder(this, item);this.function=function;
    }
    public DoneableContainerImage(ContainerImage item){
            super(item);this.builder=new ContainerImageBuilder(this, item);this.function=new Function<ContainerImage, ContainerImage>() {
    public ContainerImage apply(ContainerImage item) {
        return item;
    }
}
;
    }

    public ContainerImage done(){
             return function.apply(builder.build());
    }




}
