package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableEndpointAddress extends EndpointAddressFluentImpl<DoneableEndpointAddress> implements Doneable<EndpointAddress>{

    private final EndpointAddressBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<EndpointAddress,EndpointAddress> function;

    public DoneableEndpointAddress(io.fabric8.kubernetes.api.builder.Function<EndpointAddress,EndpointAddress> function){
            super();this.builder=new EndpointAddressBuilder(this);this.function=function;
    }
    public DoneableEndpointAddress(EndpointAddress item,io.fabric8.kubernetes.api.builder.Function<EndpointAddress,EndpointAddress> function){
            super(item);this.builder=new EndpointAddressBuilder(this, item);this.function=function;
    }
    public DoneableEndpointAddress(EndpointAddress item){
            super(item);this.builder=new EndpointAddressBuilder(this, item);this.function=new Function<EndpointAddress, EndpointAddress>() {
    public EndpointAddress apply(EndpointAddress item) {
        return item;
    }
}
;
    }

    public EndpointAddress done(){
             return function.apply(builder.build());
    }




}
