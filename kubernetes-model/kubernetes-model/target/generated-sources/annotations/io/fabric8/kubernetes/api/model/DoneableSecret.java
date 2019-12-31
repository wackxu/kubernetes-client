package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableSecret extends SecretFluentImpl<DoneableSecret> implements Doneable<Secret>{

    private final SecretBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Secret,Secret> function;

    public DoneableSecret(io.fabric8.kubernetes.api.builder.Function<Secret,Secret> function){
            super();this.builder=new SecretBuilder(this);this.function=function;
    }
    public DoneableSecret(Secret item,io.fabric8.kubernetes.api.builder.Function<Secret,Secret> function){
            super(item);this.builder=new SecretBuilder(this, item);this.function=function;
    }
    public DoneableSecret(Secret item){
            super(item);this.builder=new SecretBuilder(this, item);this.function=new Function<Secret, Secret>() {
    public Secret apply(Secret item) {
        return item;
    }
}
;
    }

    public Secret done(){
             return function.apply(builder.build());
    }




}
