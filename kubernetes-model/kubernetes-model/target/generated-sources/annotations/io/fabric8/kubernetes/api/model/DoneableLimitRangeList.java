package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableLimitRangeList extends LimitRangeListFluentImpl<DoneableLimitRangeList> implements Doneable<LimitRangeList>{

    private final LimitRangeListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<LimitRangeList,LimitRangeList> function;

    public DoneableLimitRangeList(io.fabric8.kubernetes.api.builder.Function<LimitRangeList,LimitRangeList> function){
            super();this.builder=new LimitRangeListBuilder(this);this.function=function;
    }
    public DoneableLimitRangeList(LimitRangeList item,io.fabric8.kubernetes.api.builder.Function<LimitRangeList,LimitRangeList> function){
            super(item);this.builder=new LimitRangeListBuilder(this, item);this.function=function;
    }
    public DoneableLimitRangeList(LimitRangeList item){
            super(item);this.builder=new LimitRangeListBuilder(this, item);this.function=new Function<LimitRangeList, LimitRangeList>() {
    public LimitRangeList apply(LimitRangeList item) {
        return item;
    }
}
;
    }

    public LimitRangeList done(){
             return function.apply(builder.build());
    }




}
