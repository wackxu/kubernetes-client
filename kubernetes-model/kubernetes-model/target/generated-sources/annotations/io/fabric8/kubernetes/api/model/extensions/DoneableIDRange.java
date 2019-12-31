package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableIDRange extends IDRangeFluentImpl<DoneableIDRange> implements Doneable<IDRange>{

    private final IDRangeBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<IDRange,IDRange> function;

    public DoneableIDRange(io.fabric8.kubernetes.api.builder.Function<IDRange,IDRange> function){
            super();this.builder=new IDRangeBuilder(this);this.function=function;
    }
    public DoneableIDRange(IDRange item,io.fabric8.kubernetes.api.builder.Function<IDRange,IDRange> function){
            super(item);this.builder=new IDRangeBuilder(this, item);this.function=function;
    }
    public DoneableIDRange(IDRange item){
            super(item);this.builder=new IDRangeBuilder(this, item);this.function=new Function<IDRange, IDRange>() {
    public IDRange apply(IDRange item) {
        return item;
    }
}
;
    }

    public IDRange done(){
             return function.apply(builder.build());
    }




}
