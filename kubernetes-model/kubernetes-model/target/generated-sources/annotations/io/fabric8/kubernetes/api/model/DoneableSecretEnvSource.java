package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableSecretEnvSource extends SecretEnvSourceFluentImpl<DoneableSecretEnvSource> implements Doneable<SecretEnvSource>{

    private final SecretEnvSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SecretEnvSource,SecretEnvSource> function;

    public DoneableSecretEnvSource(io.fabric8.kubernetes.api.builder.Function<SecretEnvSource,SecretEnvSource> function){
            super();this.builder=new SecretEnvSourceBuilder(this);this.function=function;
    }
    public DoneableSecretEnvSource(SecretEnvSource item,io.fabric8.kubernetes.api.builder.Function<SecretEnvSource,SecretEnvSource> function){
            super(item);this.builder=new SecretEnvSourceBuilder(this, item);this.function=function;
    }
    public DoneableSecretEnvSource(SecretEnvSource item){
            super(item);this.builder=new SecretEnvSourceBuilder(this, item);this.function=new Function<SecretEnvSource, SecretEnvSource>() {
    public SecretEnvSource apply(SecretEnvSource item) {
        return item;
    }
}
;
    }

    public SecretEnvSource done(){
             return function.apply(builder.build());
    }




}
