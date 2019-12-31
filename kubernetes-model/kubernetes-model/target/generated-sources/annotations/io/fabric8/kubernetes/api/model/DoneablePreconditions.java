package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePreconditions extends PreconditionsFluentImpl<DoneablePreconditions> implements Doneable<Preconditions>{

    private final PreconditionsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Preconditions,Preconditions> function;

    public DoneablePreconditions(io.fabric8.kubernetes.api.builder.Function<Preconditions,Preconditions> function){
            super();this.builder=new PreconditionsBuilder(this);this.function=function;
    }
    public DoneablePreconditions(Preconditions item,io.fabric8.kubernetes.api.builder.Function<Preconditions,Preconditions> function){
            super(item);this.builder=new PreconditionsBuilder(this, item);this.function=function;
    }
    public DoneablePreconditions(Preconditions item){
            super(item);this.builder=new PreconditionsBuilder(this, item);this.function=new Function<Preconditions, Preconditions>() {
    public Preconditions apply(Preconditions item) {
        return item;
    }
}
;
    }

    public Preconditions done(){
             return function.apply(builder.build());
    }




}
