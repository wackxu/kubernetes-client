package io.fabric8.kubernetes.api.model.scheduling;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneablePriorityClassList extends PriorityClassListFluentImpl<DoneablePriorityClassList> implements Doneable<PriorityClassList>{

    private final PriorityClassListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PriorityClassList,PriorityClassList> function;

    public DoneablePriorityClassList(io.fabric8.kubernetes.api.builder.Function<PriorityClassList,PriorityClassList> function){
            super();this.builder=new PriorityClassListBuilder(this);this.function=function;
    }
    public DoneablePriorityClassList(PriorityClassList item,io.fabric8.kubernetes.api.builder.Function<PriorityClassList,PriorityClassList> function){
            super(item);this.builder=new PriorityClassListBuilder(this, item);this.function=function;
    }
    public DoneablePriorityClassList(PriorityClassList item){
            super(item);this.builder=new PriorityClassListBuilder(this, item);this.function=new Function<PriorityClassList, PriorityClassList>() {
    public PriorityClassList apply(PriorityClassList item) {
        return item;
    }
}
;
    }

    public PriorityClassList done(){
             return function.apply(builder.build());
    }




}
