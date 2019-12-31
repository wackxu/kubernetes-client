package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableAzureDiskVolumeSource extends AzureDiskVolumeSourceFluentImpl<DoneableAzureDiskVolumeSource> implements Doneable<AzureDiskVolumeSource>{

    private final AzureDiskVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<AzureDiskVolumeSource,AzureDiskVolumeSource> function;

    public DoneableAzureDiskVolumeSource(io.fabric8.kubernetes.api.builder.Function<AzureDiskVolumeSource,AzureDiskVolumeSource> function){
            super();this.builder=new AzureDiskVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableAzureDiskVolumeSource(AzureDiskVolumeSource item,io.fabric8.kubernetes.api.builder.Function<AzureDiskVolumeSource,AzureDiskVolumeSource> function){
            super(item);this.builder=new AzureDiskVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableAzureDiskVolumeSource(AzureDiskVolumeSource item){
            super(item);this.builder=new AzureDiskVolumeSourceBuilder(this, item);this.function=new Function<AzureDiskVolumeSource, AzureDiskVolumeSource>() {
    public AzureDiskVolumeSource apply(AzureDiskVolumeSource item) {
        return item;
    }
}
;
    }

    public AzureDiskVolumeSource done(){
             return function.apply(builder.build());
    }




}
