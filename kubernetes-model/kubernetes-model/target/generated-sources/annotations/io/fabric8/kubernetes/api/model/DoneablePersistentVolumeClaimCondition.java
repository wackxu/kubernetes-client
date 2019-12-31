package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePersistentVolumeClaimCondition extends PersistentVolumeClaimConditionFluentImpl<DoneablePersistentVolumeClaimCondition> implements Doneable<PersistentVolumeClaimCondition>{

    private final PersistentVolumeClaimConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaimCondition,PersistentVolumeClaimCondition> function;

    public DoneablePersistentVolumeClaimCondition(io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaimCondition,PersistentVolumeClaimCondition> function){
            super();this.builder=new PersistentVolumeClaimConditionBuilder(this);this.function=function;
    }
    public DoneablePersistentVolumeClaimCondition(PersistentVolumeClaimCondition item,io.fabric8.kubernetes.api.builder.Function<PersistentVolumeClaimCondition,PersistentVolumeClaimCondition> function){
            super(item);this.builder=new PersistentVolumeClaimConditionBuilder(this, item);this.function=function;
    }
    public DoneablePersistentVolumeClaimCondition(PersistentVolumeClaimCondition item){
            super(item);this.builder=new PersistentVolumeClaimConditionBuilder(this, item);this.function=new Function<PersistentVolumeClaimCondition, PersistentVolumeClaimCondition>() {
    public PersistentVolumeClaimCondition apply(PersistentVolumeClaimCondition item) {
        return item;
    }
}
;
    }

    public PersistentVolumeClaimCondition done(){
             return function.apply(builder.build());
    }




}
