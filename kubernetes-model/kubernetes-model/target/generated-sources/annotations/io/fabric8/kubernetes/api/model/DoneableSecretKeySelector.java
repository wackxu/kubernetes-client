package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableSecretKeySelector extends SecretKeySelectorFluentImpl<DoneableSecretKeySelector> implements Doneable<SecretKeySelector>{

    private final SecretKeySelectorBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SecretKeySelector,SecretKeySelector> function;

    public DoneableSecretKeySelector(io.fabric8.kubernetes.api.builder.Function<SecretKeySelector,SecretKeySelector> function){
            super();this.builder=new SecretKeySelectorBuilder(this);this.function=function;
    }
    public DoneableSecretKeySelector(SecretKeySelector item,io.fabric8.kubernetes.api.builder.Function<SecretKeySelector,SecretKeySelector> function){
            super(item);this.builder=new SecretKeySelectorBuilder(this, item);this.function=function;
    }
    public DoneableSecretKeySelector(SecretKeySelector item){
            super(item);this.builder=new SecretKeySelectorBuilder(this, item);this.function=new Function<SecretKeySelector, SecretKeySelector>() {
    public SecretKeySelector apply(SecretKeySelector item) {
        return item;
    }
}
;
    }

    public SecretKeySelector done(){
             return function.apply(builder.build());
    }




}
