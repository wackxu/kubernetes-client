package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableDaemonEndpoint extends DaemonEndpointFluentImpl<DoneableDaemonEndpoint> implements Doneable<DaemonEndpoint>{

    private final DaemonEndpointBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DaemonEndpoint,DaemonEndpoint> function;

    public DoneableDaemonEndpoint(io.fabric8.kubernetes.api.builder.Function<DaemonEndpoint,DaemonEndpoint> function){
            super();this.builder=new DaemonEndpointBuilder(this);this.function=function;
    }
    public DoneableDaemonEndpoint(DaemonEndpoint item,io.fabric8.kubernetes.api.builder.Function<DaemonEndpoint,DaemonEndpoint> function){
            super(item);this.builder=new DaemonEndpointBuilder(this, item);this.function=function;
    }
    public DoneableDaemonEndpoint(DaemonEndpoint item){
            super(item);this.builder=new DaemonEndpointBuilder(this, item);this.function=new Function<DaemonEndpoint, DaemonEndpoint>() {
    public DaemonEndpoint apply(DaemonEndpoint item) {
        return item;
    }
}
;
    }

    public DaemonEndpoint done(){
             return function.apply(builder.build());
    }




}
