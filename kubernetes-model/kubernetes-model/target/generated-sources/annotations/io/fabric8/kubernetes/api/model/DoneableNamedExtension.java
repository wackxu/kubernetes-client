package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNamedExtension extends NamedExtensionFluentImpl<DoneableNamedExtension> implements Doneable<NamedExtension>{

    private final NamedExtensionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NamedExtension,NamedExtension> function;

    public DoneableNamedExtension(io.fabric8.kubernetes.api.builder.Function<NamedExtension,NamedExtension> function){
            super();this.builder=new NamedExtensionBuilder(this);this.function=function;
    }
    public DoneableNamedExtension(NamedExtension item,io.fabric8.kubernetes.api.builder.Function<NamedExtension,NamedExtension> function){
            super(item);this.builder=new NamedExtensionBuilder(this, item);this.function=function;
    }
    public DoneableNamedExtension(NamedExtension item){
            super(item);this.builder=new NamedExtensionBuilder(this, item);this.function=new Function<NamedExtension, NamedExtension>() {
    public NamedExtension apply(NamedExtension item) {
        return item;
    }
}
;
    }

    public NamedExtension done(){
             return function.apply(builder.build());
    }




}
