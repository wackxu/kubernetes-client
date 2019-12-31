package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableInitializer extends InitializerFluentImpl<DoneableInitializer> implements Doneable<Initializer>{

    private final InitializerBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Initializer,Initializer> function;

    public DoneableInitializer(io.fabric8.kubernetes.api.builder.Function<Initializer,Initializer> function){
            super();this.builder=new InitializerBuilder(this);this.function=function;
    }
    public DoneableInitializer(Initializer item,io.fabric8.kubernetes.api.builder.Function<Initializer,Initializer> function){
            super(item);this.builder=new InitializerBuilder(this, item);this.function=function;
    }
    public DoneableInitializer(Initializer item){
            super(item);this.builder=new InitializerBuilder(this, item);this.function=new Function<Initializer, Initializer>() {
    public Initializer apply(Initializer item) {
        return item;
    }
}
;
    }

    public Initializer done(){
             return function.apply(builder.build());
    }




}
