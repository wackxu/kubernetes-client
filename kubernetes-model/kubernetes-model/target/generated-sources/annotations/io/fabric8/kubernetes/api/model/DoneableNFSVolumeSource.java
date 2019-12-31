package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNFSVolumeSource extends NFSVolumeSourceFluentImpl<DoneableNFSVolumeSource> implements Doneable<NFSVolumeSource>{

    private final NFSVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NFSVolumeSource,NFSVolumeSource> function;

    public DoneableNFSVolumeSource(io.fabric8.kubernetes.api.builder.Function<NFSVolumeSource,NFSVolumeSource> function){
            super();this.builder=new NFSVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableNFSVolumeSource(NFSVolumeSource item,io.fabric8.kubernetes.api.builder.Function<NFSVolumeSource,NFSVolumeSource> function){
            super(item);this.builder=new NFSVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableNFSVolumeSource(NFSVolumeSource item){
            super(item);this.builder=new NFSVolumeSourceBuilder(this, item);this.function=new Function<NFSVolumeSource, NFSVolumeSource>() {
    public NFSVolumeSource apply(NFSVolumeSource item) {
        return item;
    }
}
;
    }

    public NFSVolumeSource done(){
             return function.apply(builder.build());
    }




}
