package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableBinding extends BindingFluentImpl<DoneableBinding> implements Doneable<Binding>{

    private final BindingBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Binding,Binding> function;

    public DoneableBinding(io.fabric8.kubernetes.api.builder.Function<Binding,Binding> function){
            super();this.builder=new BindingBuilder(this);this.function=function;
    }
    public DoneableBinding(Binding item,io.fabric8.kubernetes.api.builder.Function<Binding,Binding> function){
            super(item);this.builder=new BindingBuilder(this, item);this.function=function;
    }
    public DoneableBinding(Binding item){
            super(item);this.builder=new BindingBuilder(this, item);this.function=new Function<Binding, Binding>() {
    public Binding apply(Binding item) {
        return item;
    }
}
;
    }

    public Binding done(){
             return function.apply(builder.build());
    }




}
