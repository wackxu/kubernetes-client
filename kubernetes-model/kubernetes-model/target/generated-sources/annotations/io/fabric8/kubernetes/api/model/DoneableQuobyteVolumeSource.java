package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableQuobyteVolumeSource extends QuobyteVolumeSourceFluentImpl<DoneableQuobyteVolumeSource> implements Doneable<QuobyteVolumeSource>{

    private final QuobyteVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<QuobyteVolumeSource,QuobyteVolumeSource> function;

    public DoneableQuobyteVolumeSource(io.fabric8.kubernetes.api.builder.Function<QuobyteVolumeSource,QuobyteVolumeSource> function){
            super();this.builder=new QuobyteVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableQuobyteVolumeSource(QuobyteVolumeSource item,io.fabric8.kubernetes.api.builder.Function<QuobyteVolumeSource,QuobyteVolumeSource> function){
            super(item);this.builder=new QuobyteVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableQuobyteVolumeSource(QuobyteVolumeSource item){
            super(item);this.builder=new QuobyteVolumeSourceBuilder(this, item);this.function=new Function<QuobyteVolumeSource, QuobyteVolumeSource>() {
    public QuobyteVolumeSource apply(QuobyteVolumeSource item) {
        return item;
    }
}
;
    }

    public QuobyteVolumeSource done(){
             return function.apply(builder.build());
    }




}
