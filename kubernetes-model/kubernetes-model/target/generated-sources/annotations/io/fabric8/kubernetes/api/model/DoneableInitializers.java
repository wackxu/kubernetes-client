package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableInitializers extends InitializersFluentImpl<DoneableInitializers> implements Doneable<Initializers>{

    private final InitializersBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Initializers,Initializers> function;

    public DoneableInitializers(io.fabric8.kubernetes.api.builder.Function<Initializers,Initializers> function){
            super();this.builder=new InitializersBuilder(this);this.function=function;
    }
    public DoneableInitializers(Initializers item,io.fabric8.kubernetes.api.builder.Function<Initializers,Initializers> function){
            super(item);this.builder=new InitializersBuilder(this, item);this.function=function;
    }
    public DoneableInitializers(Initializers item){
            super(item);this.builder=new InitializersBuilder(this, item);this.function=new Function<Initializers, Initializers>() {
    public Initializers apply(Initializers item) {
        return item;
    }
}
;
    }

    public Initializers done(){
             return function.apply(builder.build());
    }




}
