package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNamespace extends NamespaceFluentImpl<DoneableNamespace> implements Doneable<Namespace>{

    private final NamespaceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Namespace,Namespace> function;

    public DoneableNamespace(io.fabric8.kubernetes.api.builder.Function<Namespace,Namespace> function){
            super();this.builder=new NamespaceBuilder(this);this.function=function;
    }
    public DoneableNamespace(Namespace item,io.fabric8.kubernetes.api.builder.Function<Namespace,Namespace> function){
            super(item);this.builder=new NamespaceBuilder(this, item);this.function=function;
    }
    public DoneableNamespace(Namespace item){
            super(item);this.builder=new NamespaceBuilder(this, item);this.function=new Function<Namespace, Namespace>() {
    public Namespace apply(Namespace item) {
        return item;
    }
}
;
    }

    public Namespace done(){
             return function.apply(builder.build());
    }




}
