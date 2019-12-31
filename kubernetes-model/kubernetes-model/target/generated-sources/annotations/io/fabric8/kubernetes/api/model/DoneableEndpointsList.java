package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableEndpointsList extends EndpointsListFluentImpl<DoneableEndpointsList> implements Doneable<EndpointsList>{

    private final EndpointsListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<EndpointsList,EndpointsList> function;

    public DoneableEndpointsList(io.fabric8.kubernetes.api.builder.Function<EndpointsList,EndpointsList> function){
            super();this.builder=new EndpointsListBuilder(this);this.function=function;
    }
    public DoneableEndpointsList(EndpointsList item,io.fabric8.kubernetes.api.builder.Function<EndpointsList,EndpointsList> function){
            super(item);this.builder=new EndpointsListBuilder(this, item);this.function=function;
    }
    public DoneableEndpointsList(EndpointsList item){
            super(item);this.builder=new EndpointsListBuilder(this, item);this.function=new Function<EndpointsList, EndpointsList>() {
    public EndpointsList apply(EndpointsList item) {
        return item;
    }
}
;
    }

    public EndpointsList done(){
             return function.apply(builder.build());
    }




}
