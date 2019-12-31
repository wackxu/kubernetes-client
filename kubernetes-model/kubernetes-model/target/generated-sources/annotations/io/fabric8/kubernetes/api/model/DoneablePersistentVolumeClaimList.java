package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePersistentVolumeClaimList extends PersistentVolumeClaimListFluentImpl<DoneablePersistentVolumeClaimList> implements Doneable<PersistentVolumeClaimList>{

    private final PersistentVolumeClaimListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaimList,PersistentVolumeClaimList> function;

    public DoneablePersistentVolumeClaimList(io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaimList,PersistentVolumeClaimList> function){
            super();this.builder=new PersistentVolumeClaimListBuilder(this);this.function=function;
    }
    public DoneablePersistentVolumeClaimList(PersistentVolumeClaimList item,io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaimList,PersistentVolumeClaimList> function){
            super(item);this.builder=new PersistentVolumeClaimListBuilder(this, item);this.function=function;
    }
    public DoneablePersistentVolumeClaimList(PersistentVolumeClaimList item){
            super(item);this.builder=new PersistentVolumeClaimListBuilder(this, item);this.function=new Function<PersistentVolumeClaimList, PersistentVolumeClaimList>() {
    public PersistentVolumeClaimList apply(PersistentVolumeClaimList item) {
        return item;
    }
}
;
    }

    public PersistentVolumeClaimList done(){
             return function.apply(builder.build());
    }




}
