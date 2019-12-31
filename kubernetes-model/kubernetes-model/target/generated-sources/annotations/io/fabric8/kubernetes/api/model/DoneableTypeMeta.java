package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableTypeMeta extends TypeMetaFluentImpl<DoneableTypeMeta> implements Doneable<TypeMeta>{

    private final TypeMetaBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TypeMeta,TypeMeta> function;

    public DoneableTypeMeta(io.fabric8.kubernetes.api.builder.Function<TypeMeta,TypeMeta> function){
            super();this.builder=new TypeMetaBuilder(this);this.function=function;
    }
    public DoneableTypeMeta(TypeMeta item,io.fabric8.kubernetes.api.builder.Function<TypeMeta,TypeMeta> function){
            super(item);this.builder=new TypeMetaBuilder(this, item);this.function=function;
    }
    public DoneableTypeMeta(TypeMeta item){
            super(item);this.builder=new TypeMetaBuilder(this, item);this.function=new Function<TypeMeta, TypeMeta>() {
    public TypeMeta apply(TypeMeta item) {
        return item;
    }
}
;
    }

    public TypeMeta done(){
             return function.apply(builder.build());
    }




}
