package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodTemplateList extends PodTemplateListFluentImpl<DoneablePodTemplateList> implements Doneable<PodTemplateList>{

    private final PodTemplateListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodTemplateList,PodTemplateList> function;

    public DoneablePodTemplateList(io.fabric8.kubernetes.api.builder.Function<PodTemplateList,PodTemplateList> function){
            super();this.builder=new PodTemplateListBuilder(this);this.function=function;
    }
    public DoneablePodTemplateList(PodTemplateList item,io.fabric8.kubernetes.api.builder.Function<PodTemplateList,PodTemplateList> function){
            super(item);this.builder=new PodTemplateListBuilder(this, item);this.function=function;
    }
    public DoneablePodTemplateList(PodTemplateList item){
            super(item);this.builder=new PodTemplateListBuilder(this, item);this.function=new Function<PodTemplateList, PodTemplateList>() {
    public PodTemplateList apply(PodTemplateList item) {
        return item;
    }
}
;
    }

    public PodTemplateList done(){
             return function.apply(builder.build());
    }




}
