package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableCapabilities extends CapabilitiesFluentImpl<DoneableCapabilities> implements Doneable<Capabilities>{

    private final CapabilitiesBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Capabilities,Capabilities> function;

    public DoneableCapabilities(io.fabric8.kubernetes.api.builder.Function<Capabilities,Capabilities> function){
            super();this.builder=new CapabilitiesBuilder(this);this.function=function;
    }
    public DoneableCapabilities(Capabilities item,io.fabric8.kubernetes.api.builder.Function<Capabilities,Capabilities> function){
            super(item);this.builder=new CapabilitiesBuilder(this, item);this.function=function;
    }
    public DoneableCapabilities(Capabilities item){
            super(item);this.builder=new CapabilitiesBuilder(this, item);this.function=new Function<Capabilities, Capabilities>() {
    public Capabilities apply(Capabilities item) {
        return item;
    }
}
;
    }

    public Capabilities done(){
             return function.apply(builder.build());
    }




}
