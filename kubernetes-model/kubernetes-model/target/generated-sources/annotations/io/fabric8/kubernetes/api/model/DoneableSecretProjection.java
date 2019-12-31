package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableSecretProjection extends SecretProjectionFluentImpl<DoneableSecretProjection> implements Doneable<SecretProjection>{

    private final SecretProjectionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SecretProjection,SecretProjection> function;

    public DoneableSecretProjection(io.fabric8.kubernetes.api.builder.Function<SecretProjection,SecretProjection> function){
            super();this.builder=new SecretProjectionBuilder(this);this.function=function;
    }
    public DoneableSecretProjection(SecretProjection item,io.fabric8.kubernetes.api.builder.Function<SecretProjection,SecretProjection> function){
            super(item);this.builder=new SecretProjectionBuilder(this, item);this.function=function;
    }
    public DoneableSecretProjection(SecretProjection item){
            super(item);this.builder=new SecretProjectionBuilder(this, item);this.function=new Function<SecretProjection, SecretProjection>() {
    public SecretProjection apply(SecretProjection item) {
        return item;
    }
}
;
    }

    public SecretProjection done(){
             return function.apply(builder.build());
    }




}
