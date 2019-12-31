package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableLifecycle extends LifecycleFluentImpl<DoneableLifecycle> implements Doneable<Lifecycle>{

    private final LifecycleBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Lifecycle,Lifecycle> function;

    public DoneableLifecycle(io.fabric8.kubernetes.api.builder.Function<Lifecycle,Lifecycle> function){
            super();this.builder=new LifecycleBuilder(this);this.function=function;
    }
    public DoneableLifecycle(Lifecycle item,io.fabric8.kubernetes.api.builder.Function<Lifecycle,Lifecycle> function){
            super(item);this.builder=new LifecycleBuilder(this, item);this.function=function;
    }
    public DoneableLifecycle(Lifecycle item){
            super(item);this.builder=new LifecycleBuilder(this, item);this.function=new Function<Lifecycle, Lifecycle>() {
    public Lifecycle apply(Lifecycle item) {
        return item;
    }
}
;
    }

    public Lifecycle done(){
             return function.apply(builder.build());
    }




}
