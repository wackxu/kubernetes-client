package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableObjectReference extends ObjectReferenceFluentImpl<DoneableObjectReference> implements Doneable<ObjectReference>{

    private final ObjectReferenceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ObjectReference,ObjectReference> function;

    public DoneableObjectReference(io.fabric8.kubernetes.api.builder.Function<ObjectReference,ObjectReference> function){
            super();this.builder=new ObjectReferenceBuilder(this);this.function=function;
    }
    public DoneableObjectReference(ObjectReference item,io.fabric8.kubernetes.api.builder.Function<ObjectReference,ObjectReference> function){
            super(item);this.builder=new ObjectReferenceBuilder(this, item);this.function=function;
    }
    public DoneableObjectReference(ObjectReference item){
            super(item);this.builder=new ObjectReferenceBuilder(this, item);this.function=new Function<ObjectReference, ObjectReference>() {
    public ObjectReference apply(ObjectReference item) {
        return item;
    }
}
;
    }

    public ObjectReference done(){
             return function.apply(builder.build());
    }




}
