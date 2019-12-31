package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePersistentVolumeClaim extends PersistentVolumeClaimFluentImpl<DoneablePersistentVolumeClaim> implements Doneable<PersistentVolumeClaim>{

    private final PersistentVolumeClaimBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaim,PersistentVolumeClaim> function;

    public DoneablePersistentVolumeClaim(io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaim,PersistentVolumeClaim> function){
            super();this.builder=new PersistentVolumeClaimBuilder(this);this.function=function;
    }
    public DoneablePersistentVolumeClaim(PersistentVolumeClaim item,io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaim,PersistentVolumeClaim> function){
            super(item);this.builder=new PersistentVolumeClaimBuilder(this, item);this.function=function;
    }
    public DoneablePersistentVolumeClaim(PersistentVolumeClaim item){
            super(item);this.builder=new PersistentVolumeClaimBuilder(this, item);this.function=new Function<PersistentVolumeClaim, PersistentVolumeClaim>() {
    public PersistentVolumeClaim apply(PersistentVolumeClaim item) {
        return item;
    }
}
;
    }

    public PersistentVolumeClaim done(){
             return function.apply(builder.build());
    }




}
