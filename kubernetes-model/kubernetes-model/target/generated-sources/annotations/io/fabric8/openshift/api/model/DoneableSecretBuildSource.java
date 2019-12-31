package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSecretBuildSource extends SecretBuildSourceFluentImpl<DoneableSecretBuildSource> implements Doneable<SecretBuildSource>{

    private final SecretBuildSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SecretBuildSource,SecretBuildSource> function;

    public DoneableSecretBuildSource(io.fabric8.kubernetes.api.builder.Function<SecretBuildSource,SecretBuildSource> function){
            super();this.builder=new SecretBuildSourceBuilder(this);this.function=function;
    }
    public DoneableSecretBuildSource(SecretBuildSource item,io.fabric8.kubernetes.api.builder.Function<SecretBuildSource,SecretBuildSource> function){
            super(item);this.builder=new SecretBuildSourceBuilder(this, item);this.function=function;
    }
    public DoneableSecretBuildSource(SecretBuildSource item){
            super(item);this.builder=new SecretBuildSourceBuilder(this, item);this.function=new Function<SecretBuildSource, SecretBuildSource>() {
    public SecretBuildSource apply(SecretBuildSource item) {
        return item;
    }
}
;
    }

    public SecretBuildSource done(){
             return function.apply(builder.build());
    }




}
