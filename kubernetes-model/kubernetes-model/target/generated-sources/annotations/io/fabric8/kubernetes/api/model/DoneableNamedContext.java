package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNamedContext extends NamedContextFluentImpl<DoneableNamedContext> implements Doneable<NamedContext>{

    private final NamedContextBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NamedContext,NamedContext> function;

    public DoneableNamedContext(io.fabric8.kubernetes.api.builder.Function<NamedContext,NamedContext> function){
            super();this.builder=new NamedContextBuilder(this);this.function=function;
    }
    public DoneableNamedContext(NamedContext item,io.fabric8.kubernetes.api.builder.Function<NamedContext,NamedContext> function){
            super(item);this.builder=new NamedContextBuilder(this, item);this.function=function;
    }
    public DoneableNamedContext(NamedContext item){
            super(item);this.builder=new NamedContextBuilder(this, item);this.function=new Function<NamedContext, NamedContext>() {
    public NamedContext apply(NamedContext item) {
        return item;
    }
}
;
    }

    public NamedContext done(){
             return function.apply(builder.build());
    }




}
