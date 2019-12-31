package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodList extends PodListFluentImpl<DoneablePodList> implements Doneable<PodList>{

    private final PodListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodList,PodList> function;

    public DoneablePodList(io.fabric8.kubernetes.api.builder.Function<PodList,PodList> function){
            super();this.builder=new PodListBuilder(this);this.function=function;
    }
    public DoneablePodList(PodList item,io.fabric8.kubernetes.api.builder.Function<PodList,PodList> function){
            super(item);this.builder=new PodListBuilder(this, item);this.function=function;
    }
    public DoneablePodList(PodList item){
            super(item);this.builder=new PodListBuilder(this, item);this.function=new Function<PodList, PodList>() {
    public PodList apply(PodList item) {
        return item;
    }
}
;
    }

    public PodList done(){
             return function.apply(builder.build());
    }




}
