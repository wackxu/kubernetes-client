package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePersistentVolumeList extends PersistentVolumeListFluentImpl<DoneablePersistentVolumeList> implements Doneable<PersistentVolumeList>{

    private final PersistentVolumeListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PersistentVolumeList,PersistentVolumeList> function;

    public DoneablePersistentVolumeList(io.fabric8.kubernetes.api.builder.Function<PersistentVolumeList,PersistentVolumeList> function){
            super();this.builder=new PersistentVolumeListBuilder(this);this.function=function;
    }
    public DoneablePersistentVolumeList(PersistentVolumeList item,io.fabric8.kubernetes.api.builder.Function<PersistentVolumeList,PersistentVolumeList> function){
            super(item);this.builder=new PersistentVolumeListBuilder(this, item);this.function=function;
    }
    public DoneablePersistentVolumeList(PersistentVolumeList item){
            super(item);this.builder=new PersistentVolumeListBuilder(this, item);this.function=new Function<PersistentVolumeList, PersistentVolumeList>() {
    public PersistentVolumeList apply(PersistentVolumeList item) {
        return item;
    }
}
;
    }

    public PersistentVolumeList done(){
             return function.apply(builder.build());
    }




}
