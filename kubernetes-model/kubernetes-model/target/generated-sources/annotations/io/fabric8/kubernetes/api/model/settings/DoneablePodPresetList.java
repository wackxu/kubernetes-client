package io.fabric8.kubernetes.api.model.settings;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneablePodPresetList extends PodPresetListFluentImpl<DoneablePodPresetList> implements Doneable<PodPresetList>{

    private final PodPresetListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodPresetList,PodPresetList> function;

    public DoneablePodPresetList(io.fabric8.kubernetes.api.builder.Function<PodPresetList,PodPresetList> function){
            super();this.builder=new PodPresetListBuilder(this);this.function=function;
    }
    public DoneablePodPresetList(PodPresetList item,io.fabric8.kubernetes.api.builder.Function<PodPresetList,PodPresetList> function){
            super(item);this.builder=new PodPresetListBuilder(this, item);this.function=function;
    }
    public DoneablePodPresetList(PodPresetList item){
            super(item);this.builder=new PodPresetListBuilder(this, item);this.function=new Function<PodPresetList, PodPresetList>() {
    public PodPresetList apply(PodPresetList item) {
        return item;
    }
}
;
    }

    public PodPresetList done(){
             return function.apply(builder.build());
    }




}
