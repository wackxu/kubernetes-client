package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableContainer extends ContainerFluentImpl<DoneableContainer> implements Doneable<Container>{

    private final ContainerBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Container,Container> function;

    public DoneableContainer(io.fabric8.kubernetes.api.builder.Function<Container,Container> function){
            super();this.builder=new ContainerBuilder(this);this.function=function;
    }
    public DoneableContainer(Container item,io.fabric8.kubernetes.api.builder.Function<Container,Container> function){
            super(item);this.builder=new ContainerBuilder(this, item);this.function=function;
    }
    public DoneableContainer(Container item){
            super(item);this.builder=new ContainerBuilder(this, item);this.function=new Function<Container, Container>() {
    public Container apply(Container item) {
        return item;
    }
}
;
    }

    public Container done(){
             return function.apply(builder.build());
    }




}
