package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableLimitRange extends LimitRangeFluentImpl<DoneableLimitRange> implements Doneable<LimitRange>{

    private final LimitRangeBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<LimitRange,LimitRange> function;

    public DoneableLimitRange(io.fabric8.kubernetes.api.builder.Function<LimitRange,LimitRange> function){
            super();this.builder=new LimitRangeBuilder(this);this.function=function;
    }
    public DoneableLimitRange(LimitRange item,io.fabric8.kubernetes.api.builder.Function<LimitRange,LimitRange> function){
            super(item);this.builder=new LimitRangeBuilder(this, item);this.function=function;
    }
    public DoneableLimitRange(LimitRange item){
            super(item);this.builder=new LimitRangeBuilder(this, item);this.function=new Function<LimitRange, LimitRange>() {
    public LimitRange apply(LimitRange item) {
        return item;
    }
}
;
    }

    public LimitRange done(){
             return function.apply(builder.build());
    }




}
