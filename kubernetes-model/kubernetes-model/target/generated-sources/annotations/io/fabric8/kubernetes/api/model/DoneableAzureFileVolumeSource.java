package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableAzureFileVolumeSource extends AzureFileVolumeSourceFluentImpl<DoneableAzureFileVolumeSource> implements Doneable<AzureFileVolumeSource>{

    private final AzureFileVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<AzureFileVolumeSource,AzureFileVolumeSource> function;

    public DoneableAzureFileVolumeSource(io.fabric8.kubernetes.api.builder.Function<AzureFileVolumeSource,AzureFileVolumeSource> function){
            super();this.builder=new AzureFileVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableAzureFileVolumeSource(AzureFileVolumeSource item,io.fabric8.kubernetes.api.builder.Function<AzureFileVolumeSource,AzureFileVolumeSource> function){
            super(item);this.builder=new AzureFileVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableAzureFileVolumeSource(AzureFileVolumeSource item){
            super(item);this.builder=new AzureFileVolumeSourceBuilder(this, item);this.function=new Function<AzureFileVolumeSource, AzureFileVolumeSource>() {
    public AzureFileVolumeSource apply(AzureFileVolumeSource item) {
        return item;
    }
}
;
    }

    public AzureFileVolumeSource done(){
             return function.apply(builder.build());
    }




}
