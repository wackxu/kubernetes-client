package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableLimitRangeSpec extends LimitRangeSpecFluentImpl<DoneableLimitRangeSpec> implements Doneable<LimitRangeSpec>{

    private final LimitRangeSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<LimitRangeSpec,LimitRangeSpec> function;

    public DoneableLimitRangeSpec(io.fabric8.kubernetes.api.builder.Function<LimitRangeSpec,LimitRangeSpec> function){
            super();this.builder=new LimitRangeSpecBuilder(this);this.function=function;
    }
    public DoneableLimitRangeSpec(LimitRangeSpec item,io.fabric8.kubernetes.api.builder.Function<LimitRangeSpec,LimitRangeSpec> function){
            super(item);this.builder=new LimitRangeSpecBuilder(this, item);this.function=function;
    }
    public DoneableLimitRangeSpec(LimitRangeSpec item){
            super(item);this.builder=new LimitRangeSpecBuilder(this, item);this.function=new Function<LimitRangeSpec, LimitRangeSpec>() {
    public LimitRangeSpec apply(LimitRangeSpec item) {
        return item;
    }
}
;
    }

    public LimitRangeSpec done(){
             return function.apply(builder.build());
    }




}
