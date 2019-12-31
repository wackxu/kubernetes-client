package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableEndpoints extends EndpointsFluentImpl<DoneableEndpoints> implements Doneable<Endpoints>{

    private final EndpointsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Endpoints,Endpoints> function;

    public DoneableEndpoints(io.fabric8.kubernetes.api.builder.Function<Endpoints,Endpoints> function){
            super();this.builder=new EndpointsBuilder(this);this.function=function;
    }
    public DoneableEndpoints(Endpoints item,io.fabric8.kubernetes.api.builder.Function<Endpoints,Endpoints> function){
            super(item);this.builder=new EndpointsBuilder(this, item);this.function=function;
    }
    public DoneableEndpoints(Endpoints item){
            super(item);this.builder=new EndpointsBuilder(this, item);this.function=new Function<Endpoints, Endpoints>() {
    public Endpoints apply(Endpoints item) {
        return item;
    }
}
;
    }

    public Endpoints done(){
             return function.apply(builder.build());
    }




}
