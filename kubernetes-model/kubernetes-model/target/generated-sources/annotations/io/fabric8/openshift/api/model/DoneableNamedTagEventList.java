package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableNamedTagEventList extends NamedTagEventListFluentImpl<DoneableNamedTagEventList> implements Doneable<NamedTagEventList>{

    private final NamedTagEventListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NamedTagEventList,NamedTagEventList> function;

    public DoneableNamedTagEventList(io.fabric8.kubernetes.api.builder.Function<NamedTagEventList,NamedTagEventList> function){
            super();this.builder=new NamedTagEventListBuilder(this);this.function=function;
    }
    public DoneableNamedTagEventList(NamedTagEventList item,io.fabric8.kubernetes.api.builder.Function<NamedTagEventList,NamedTagEventList> function){
            super(item);this.builder=new NamedTagEventListBuilder(this, item);this.function=function;
    }
    public DoneableNamedTagEventList(NamedTagEventList item){
            super(item);this.builder=new NamedTagEventListBuilder(this, item);this.function=new Function<NamedTagEventList, NamedTagEventList>() {
    public NamedTagEventList apply(NamedTagEventList item) {
        return item;
    }
}
;
    }

    public NamedTagEventList done(){
             return function.apply(builder.build());
    }




}
