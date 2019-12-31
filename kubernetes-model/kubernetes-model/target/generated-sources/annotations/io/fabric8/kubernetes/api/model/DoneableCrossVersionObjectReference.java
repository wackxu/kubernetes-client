package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableCrossVersionObjectReference extends CrossVersionObjectReferenceFluentImpl<DoneableCrossVersionObjectReference> implements Doneable<CrossVersionObjectReference>{

    private final CrossVersionObjectReferenceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CrossVersionObjectReference,CrossVersionObjectReference> function;

    public DoneableCrossVersionObjectReference(io.fabric8.kubernetes.api.builder.Function<CrossVersionObjectReference,CrossVersionObjectReference> function){
            super();this.builder=new CrossVersionObjectReferenceBuilder(this);this.function=function;
    }
    public DoneableCrossVersionObjectReference(CrossVersionObjectReference item,io.fabric8.kubernetes.api.builder.Function<CrossVersionObjectReference,CrossVersionObjectReference> function){
            super(item);this.builder=new CrossVersionObjectReferenceBuilder(this, item);this.function=function;
    }
    public DoneableCrossVersionObjectReference(CrossVersionObjectReference item){
            super(item);this.builder=new CrossVersionObjectReferenceBuilder(this, item);this.function=new Function<CrossVersionObjectReference, CrossVersionObjectReference>() {
    public CrossVersionObjectReference apply(CrossVersionObjectReference item) {
        return item;
    }
}
;
    }

    public CrossVersionObjectReference done(){
             return function.apply(builder.build());
    }




}
