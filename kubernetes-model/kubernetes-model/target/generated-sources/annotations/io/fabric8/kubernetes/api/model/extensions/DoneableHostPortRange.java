package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableHostPortRange extends HostPortRangeFluentImpl<DoneableHostPortRange> implements Doneable<HostPortRange>{

    private final HostPortRangeBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<HostPortRange,HostPortRange> function;

    public DoneableHostPortRange(io.fabric8.kubernetes.api.builder.Function<HostPortRange,HostPortRange> function){
            super();this.builder=new HostPortRangeBuilder(this);this.function=function;
    }
    public DoneableHostPortRange(HostPortRange item,io.fabric8.kubernetes.api.builder.Function<HostPortRange,HostPortRange> function){
            super(item);this.builder=new HostPortRangeBuilder(this, item);this.function=function;
    }
    public DoneableHostPortRange(HostPortRange item){
            super(item);this.builder=new HostPortRangeBuilder(this, item);this.function=new Function<HostPortRange, HostPortRange>() {
    public HostPortRange apply(HostPortRange item) {
        return item;
    }
}
;
    }

    public HostPortRange done(){
             return function.apply(builder.build());
    }




}
