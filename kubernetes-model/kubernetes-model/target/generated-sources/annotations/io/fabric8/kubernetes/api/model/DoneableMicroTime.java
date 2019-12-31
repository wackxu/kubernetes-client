package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableMicroTime extends MicroTimeFluentImpl<DoneableMicroTime> implements Doneable<MicroTime>{

    private final MicroTimeBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<MicroTime,MicroTime> function;

    public DoneableMicroTime(io.fabric8.kubernetes.api.builder.Function<MicroTime,MicroTime> function){
            super();this.builder=new MicroTimeBuilder(this);this.function=function;
    }
    public DoneableMicroTime(MicroTime item,io.fabric8.kubernetes.api.builder.Function<MicroTime,MicroTime> function){
            super(item);this.builder=new MicroTimeBuilder(this, item);this.function=function;
    }
    public DoneableMicroTime(MicroTime item){
            super(item);this.builder=new MicroTimeBuilder(this, item);this.function=new Function<MicroTime, MicroTime>() {
    public MicroTime apply(MicroTime item) {
        return item;
    }
}
;
    }

    public MicroTime done(){
             return function.apply(builder.build());
    }




}
