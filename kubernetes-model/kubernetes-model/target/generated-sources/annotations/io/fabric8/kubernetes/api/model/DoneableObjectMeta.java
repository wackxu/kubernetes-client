package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableObjectMeta extends ObjectMetaFluentImpl<DoneableObjectMeta> implements Doneable<ObjectMeta>{

    private final ObjectMetaBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ObjectMeta,ObjectMeta> function;

    public DoneableObjectMeta(io.fabric8.kubernetes.api.builder.Function<ObjectMeta,ObjectMeta> function){
            super();this.builder=new ObjectMetaBuilder(this);this.function=function;
    }
    public DoneableObjectMeta(ObjectMeta item,io.fabric8.kubernetes.api.builder.Function<ObjectMeta,ObjectMeta> function){
            super(item);this.builder=new ObjectMetaBuilder(this, item);this.function=function;
    }
    public DoneableObjectMeta(ObjectMeta item){
            super(item);this.builder=new ObjectMetaBuilder(this, item);this.function=new Function<ObjectMeta, ObjectMeta>() {
    public ObjectMeta apply(ObjectMeta item) {
        return item;
    }
}
;
    }

    public ObjectMeta done(){
             return function.apply(builder.build());
    }




}
