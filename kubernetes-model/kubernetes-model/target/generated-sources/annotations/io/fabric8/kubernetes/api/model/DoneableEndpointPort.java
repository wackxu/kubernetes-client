package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableEndpointPort extends EndpointPortFluentImpl<DoneableEndpointPort> implements Doneable<EndpointPort>{

    private final EndpointPortBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<EndpointPort,EndpointPort> function;

    public DoneableEndpointPort(io.fabric8.kubernetes.api.builder.Function<EndpointPort,EndpointPort> function){
            super();this.builder=new EndpointPortBuilder(this);this.function=function;
    }
    public DoneableEndpointPort(EndpointPort item,io.fabric8.kubernetes.api.builder.Function<EndpointPort,EndpointPort> function){
            super(item);this.builder=new EndpointPortBuilder(this, item);this.function=function;
    }
    public DoneableEndpointPort(EndpointPort item){
            super(item);this.builder=new EndpointPortBuilder(this, item);this.function=new Function<EndpointPort, EndpointPort>() {
    public EndpointPort apply(EndpointPort item) {
        return item;
    }
}
;
    }

    public EndpointPort done(){
             return function.apply(builder.build());
    }




}
