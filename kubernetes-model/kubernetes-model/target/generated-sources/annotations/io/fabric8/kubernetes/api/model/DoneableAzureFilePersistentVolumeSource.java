package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableAzureFilePersistentVolumeSource extends AzureFilePersistentVolumeSourceFluentImpl<DoneableAzureFilePersistentVolumeSource> implements Doneable<AzureFilePersistentVolumeSource>{

    private final AzureFilePersistentVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<AzureFilePersistentVolumeSource,AzureFilePersistentVolumeSource> function;

    public DoneableAzureFilePersistentVolumeSource(io.fabric8.kubernetes.api.builder.Function<AzureFilePersistentVolumeSource,AzureFilePersistentVolumeSource> function){
            super();this.builder=new AzureFilePersistentVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableAzureFilePersistentVolumeSource(AzureFilePersistentVolumeSource item,io.fabric8.kubernetes.api.builder.Function<AzureFilePersistentVolumeSource,AzureFilePersistentVolumeSource> function){
            super(item);this.builder=new AzureFilePersistentVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableAzureFilePersistentVolumeSource(AzureFilePersistentVolumeSource item){
            super(item);this.builder=new AzureFilePersistentVolumeSourceBuilder(this, item);this.function=new Function<AzureFilePersistentVolumeSource, AzureFilePersistentVolumeSource>() {
    public AzureFilePersistentVolumeSource apply(AzureFilePersistentVolumeSource item) {
        return item;
    }
}
;
    }

    public AzureFilePersistentVolumeSource done(){
             return function.apply(builder.build());
    }




}
