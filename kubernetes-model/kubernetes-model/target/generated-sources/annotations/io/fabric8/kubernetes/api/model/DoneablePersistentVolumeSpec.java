package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePersistentVolumeSpec extends PersistentVolumeSpecFluentImpl<DoneablePersistentVolumeSpec> implements Doneable<PersistentVolumeSpec>{

    private final PersistentVolumeSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PersistentVolumeSpec,PersistentVolumeSpec> function;

    public DoneablePersistentVolumeSpec(io.fabric8.kubernetes.api.builder.Function<PersistentVolumeSpec,PersistentVolumeSpec> function){
            super();this.builder=new PersistentVolumeSpecBuilder(this);this.function=function;
    }
    public DoneablePersistentVolumeSpec(PersistentVolumeSpec item,io.fabric8.kubernetes.api.builder.Function<PersistentVolumeSpec,PersistentVolumeSpec> function){
            super(item);this.builder=new PersistentVolumeSpecBuilder(this, item);this.function=function;
    }
    public DoneablePersistentVolumeSpec(PersistentVolumeSpec item){
            super(item);this.builder=new PersistentVolumeSpecBuilder(this, item);this.function=new Function<PersistentVolumeSpec, PersistentVolumeSpec>() {
    public PersistentVolumeSpec apply(PersistentVolumeSpec item) {
        return item;
    }
}
;
    }

    public PersistentVolumeSpec done(){
             return function.apply(builder.build());
    }




}
