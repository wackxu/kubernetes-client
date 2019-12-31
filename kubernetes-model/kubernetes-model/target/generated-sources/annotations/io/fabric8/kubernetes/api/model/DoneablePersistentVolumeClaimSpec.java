package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePersistentVolumeClaimSpec extends PersistentVolumeClaimSpecFluentImpl<DoneablePersistentVolumeClaimSpec> implements Doneable<PersistentVolumeClaimSpec>{

    private final PersistentVolumeClaimSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaimSpec,PersistentVolumeClaimSpec> function;

    public DoneablePersistentVolumeClaimSpec(io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaimSpec,PersistentVolumeClaimSpec> function){
            super();this.builder=new PersistentVolumeClaimSpecBuilder(this);this.function=function;
    }
    public DoneablePersistentVolumeClaimSpec(PersistentVolumeClaimSpec item,io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaimSpec,PersistentVolumeClaimSpec> function){
            super(item);this.builder=new PersistentVolumeClaimSpecBuilder(this, item);this.function=function;
    }
    public DoneablePersistentVolumeClaimSpec(PersistentVolumeClaimSpec item){
            super(item);this.builder=new PersistentVolumeClaimSpecBuilder(this, item);this.function=new Function<PersistentVolumeClaimSpec, PersistentVolumeClaimSpec>() {
    public PersistentVolumeClaimSpec apply(PersistentVolumeClaimSpec item) {
        return item;
    }
}
;
    }

    public PersistentVolumeClaimSpec done(){
             return function.apply(builder.build());
    }




}
