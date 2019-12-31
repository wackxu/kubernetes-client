package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableOwnerReference extends OwnerReferenceFluentImpl<DoneableOwnerReference> implements Doneable<OwnerReference>{

    private final OwnerReferenceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OwnerReference,OwnerReference> function;

    public DoneableOwnerReference(io.fabric8.kubernetes.api.builder.Function<OwnerReference,OwnerReference> function){
            super();this.builder=new OwnerReferenceBuilder(this);this.function=function;
    }
    public DoneableOwnerReference(OwnerReference item,io.fabric8.kubernetes.api.builder.Function<OwnerReference,OwnerReference> function){
            super(item);this.builder=new OwnerReferenceBuilder(this, item);this.function=function;
    }
    public DoneableOwnerReference(OwnerReference item){
            super(item);this.builder=new OwnerReferenceBuilder(this, item);this.function=new Function<OwnerReference, OwnerReference>() {
    public OwnerReference apply(OwnerReference item) {
        return item;
    }
}
;
    }

    public OwnerReference done(){
             return function.apply(builder.build());
    }




}
