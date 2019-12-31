package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableContext extends ContextFluentImpl<DoneableContext> implements Doneable<Context>{

    private final ContextBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Context,Context> function;

    public DoneableContext(io.fabric8.kubernetes.api.builder.Function<Context,Context> function){
            super();this.builder=new ContextBuilder(this);this.function=function;
    }
    public DoneableContext(Context item,io.fabric8.kubernetes.api.builder.Function<Context,Context> function){
            super(item);this.builder=new ContextBuilder(this, item);this.function=function;
    }
    public DoneableContext(Context item){
            super(item);this.builder=new ContextBuilder(this, item);this.function=new Function<Context, Context>() {
    public Context apply(Context item) {
        return item;
    }
}
;
    }

    public Context done(){
             return function.apply(builder.build());
    }




}
