package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableSecretVolumeSource extends SecretVolumeSourceFluentImpl<DoneableSecretVolumeSource> implements Doneable<SecretVolumeSource>{

    private final SecretVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SecretVolumeSource,SecretVolumeSource> function;

    public DoneableSecretVolumeSource(io.fabric8.kubernetes.api.builder.Function<SecretVolumeSource,SecretVolumeSource> function){
            super();this.builder=new SecretVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableSecretVolumeSource(SecretVolumeSource item,io.fabric8.kubernetes.api.builder.Function<SecretVolumeSource,SecretVolumeSource> function){
            super(item);this.builder=new SecretVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableSecretVolumeSource(SecretVolumeSource item){
            super(item);this.builder=new SecretVolumeSourceBuilder(this, item);this.function=new Function<SecretVolumeSource, SecretVolumeSource>() {
    public SecretVolumeSource apply(SecretVolumeSource item) {
        return item;
    }
}
;
    }

    public SecretVolumeSource done(){
             return function.apply(builder.build());
    }




}
