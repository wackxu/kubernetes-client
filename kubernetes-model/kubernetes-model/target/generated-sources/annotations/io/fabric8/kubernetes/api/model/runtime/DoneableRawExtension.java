package io.fabric8.kubernetes.api.model.runtime;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRawExtension extends RawExtensionFluentImpl<DoneableRawExtension> implements Doneable<RawExtension>{

    private final RawExtensionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RawExtension,RawExtension> function;

    public DoneableRawExtension(io.fabric8.kubernetes.api.builder.Function<RawExtension,RawExtension> function){
            super();this.builder=new RawExtensionBuilder(this);this.function=function;
    }
    public DoneableRawExtension(RawExtension item,io.fabric8.kubernetes.api.builder.Function<RawExtension,RawExtension> function){
            super(item);this.builder=new RawExtensionBuilder(this, item);this.function=function;
    }
    public DoneableRawExtension(RawExtension item){
            super(item);this.builder=new RawExtensionBuilder(this, item);this.function=new Function<RawExtension, RawExtension>() {
    public RawExtension apply(RawExtension item) {
        return item;
    }
}
;
    }

    public RawExtension done(){
             return function.apply(builder.build());
    }




}
