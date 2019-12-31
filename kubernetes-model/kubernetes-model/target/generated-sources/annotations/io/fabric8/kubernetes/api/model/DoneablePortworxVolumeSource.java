package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePortworxVolumeSource extends PortworxVolumeSourceFluentImpl<DoneablePortworxVolumeSource> implements Doneable<PortworxVolumeSource>{

    private final PortworxVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PortworxVolumeSource,PortworxVolumeSource> function;

    public DoneablePortworxVolumeSource(io.fabric8.kubernetes.api.builder.Function<PortworxVolumeSource,PortworxVolumeSource> function){
            super();this.builder=new PortworxVolumeSourceBuilder(this);this.function=function;
    }
    public DoneablePortworxVolumeSource(PortworxVolumeSource item,io.fabric8.kubernetes.api.builder.Function<PortworxVolumeSource,PortworxVolumeSource> function){
            super(item);this.builder=new PortworxVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneablePortworxVolumeSource(PortworxVolumeSource item){
            super(item);this.builder=new PortworxVolumeSourceBuilder(this, item);this.function=new Function<PortworxVolumeSource, PortworxVolumeSource>() {
    public PortworxVolumeSource apply(PortworxVolumeSource item) {
        return item;
    }
}
;
    }

    public PortworxVolumeSource done(){
             return function.apply(builder.build());
    }




}
