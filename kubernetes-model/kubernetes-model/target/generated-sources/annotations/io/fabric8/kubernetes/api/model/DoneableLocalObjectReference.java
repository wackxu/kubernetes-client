package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableLocalObjectReference extends LocalObjectReferenceFluentImpl<DoneableLocalObjectReference> implements Doneable<LocalObjectReference>{

    private final LocalObjectReferenceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<LocalObjectReference,LocalObjectReference> function;

    public DoneableLocalObjectReference(io.fabric8.kubernetes.api.builder.Function<LocalObjectReference,LocalObjectReference> function){
            super();this.builder=new LocalObjectReferenceBuilder(this);this.function=function;
    }
    public DoneableLocalObjectReference(LocalObjectReference item,io.fabric8.kubernetes.api.builder.Function<LocalObjectReference,LocalObjectReference> function){
            super(item);this.builder=new LocalObjectReferenceBuilder(this, item);this.function=function;
    }
    public DoneableLocalObjectReference(LocalObjectReference item){
            super(item);this.builder=new LocalObjectReferenceBuilder(this, item);this.function=new Function<LocalObjectReference, LocalObjectReference>() {
    public LocalObjectReference apply(LocalObjectReference item) {
        return item;
    }
}
;
    }

    public LocalObjectReference done(){
             return function.apply(builder.build());
    }




}
