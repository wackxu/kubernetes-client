package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableTypedLocalObjectReference extends TypedLocalObjectReferenceFluentImpl<DoneableTypedLocalObjectReference> implements Doneable<TypedLocalObjectReference>{

    private final TypedLocalObjectReferenceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TypedLocalObjectReference,TypedLocalObjectReference> function;

    public DoneableTypedLocalObjectReference(io.fabric8.kubernetes.api.builder.Function<TypedLocalObjectReference,TypedLocalObjectReference> function){
            super();this.builder=new TypedLocalObjectReferenceBuilder(this);this.function=function;
    }
    public DoneableTypedLocalObjectReference(TypedLocalObjectReference item,io.fabric8.kubernetes.api.builder.Function<TypedLocalObjectReference,TypedLocalObjectReference> function){
            super(item);this.builder=new TypedLocalObjectReferenceBuilder(this, item);this.function=function;
    }
    public DoneableTypedLocalObjectReference(TypedLocalObjectReference item){
            super(item);this.builder=new TypedLocalObjectReferenceBuilder(this, item);this.function=new Function<TypedLocalObjectReference, TypedLocalObjectReference>() {
    public TypedLocalObjectReference apply(TypedLocalObjectReference item) {
        return item;
    }
}
;
    }

    public TypedLocalObjectReference done(){
             return function.apply(builder.build());
    }




}
