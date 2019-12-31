package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableLimitRangeItem extends LimitRangeItemFluentImpl<DoneableLimitRangeItem> implements Doneable<LimitRangeItem>{

    private final LimitRangeItemBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<LimitRangeItem,LimitRangeItem> function;

    public DoneableLimitRangeItem(io.fabric8.kubernetes.api.builder.Function<LimitRangeItem,LimitRangeItem> function){
            super();this.builder=new LimitRangeItemBuilder(this);this.function=function;
    }
    public DoneableLimitRangeItem(LimitRangeItem item,io.fabric8.kubernetes.api.builder.Function<LimitRangeItem,LimitRangeItem> function){
            super(item);this.builder=new LimitRangeItemBuilder(this, item);this.function=function;
    }
    public DoneableLimitRangeItem(LimitRangeItem item){
            super(item);this.builder=new LimitRangeItemBuilder(this, item);this.function=new Function<LimitRangeItem, LimitRangeItem>() {
    public LimitRangeItem apply(LimitRangeItem item) {
        return item;
    }
}
;
    }

    public LimitRangeItem done(){
             return function.apply(builder.build());
    }




}
