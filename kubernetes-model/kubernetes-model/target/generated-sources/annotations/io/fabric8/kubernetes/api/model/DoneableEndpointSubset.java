package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableEndpointSubset extends EndpointSubsetFluentImpl<DoneableEndpointSubset> implements Doneable<EndpointSubset>{

    private final EndpointSubsetBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<EndpointSubset,EndpointSubset> function;

    public DoneableEndpointSubset(io.fabric8.kubernetes.api.builder.Function<EndpointSubset,EndpointSubset> function){
            super();this.builder=new EndpointSubsetBuilder(this);this.function=function;
    }
    public DoneableEndpointSubset(EndpointSubset item,io.fabric8.kubernetes.api.builder.Function<EndpointSubset,EndpointSubset> function){
            super(item);this.builder=new EndpointSubsetBuilder(this, item);this.function=function;
    }
    public DoneableEndpointSubset(EndpointSubset item){
            super(item);this.builder=new EndpointSubsetBuilder(this, item);this.function=new Function<EndpointSubset, EndpointSubset>() {
    public EndpointSubset apply(EndpointSubset item) {
        return item;
    }
}
;
    }

    public EndpointSubset done(){
             return function.apply(builder.build());
    }




}
