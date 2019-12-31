package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableScale extends ScaleFluentImpl<DoneableScale> implements Doneable<Scale>{

    private final ScaleBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Scale,Scale> function;

    public DoneableScale(io.fabric8.kubernetes.api.builder.Function<Scale,Scale> function){
            super();this.builder=new ScaleBuilder(this);this.function=function;
    }
    public DoneableScale(Scale item,io.fabric8.kubernetes.api.builder.Function<Scale,Scale> function){
            super(item);this.builder=new ScaleBuilder(this, item);this.function=function;
    }
    public DoneableScale(Scale item){
            super(item);this.builder=new ScaleBuilder(this, item);this.function=new Function<Scale, Scale>() {
    public Scale apply(Scale item) {
        return item;
    }
}
;
    }

    public Scale done(){
             return function.apply(builder.build());
    }




}
