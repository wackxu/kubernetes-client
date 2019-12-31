package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRoutePort extends RoutePortFluentImpl<DoneableRoutePort> implements Doneable<RoutePort>{

    private final RoutePortBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RoutePort,RoutePort> function;

    public DoneableRoutePort(io.fabric8.kubernetes.api.builder.Function<RoutePort,RoutePort> function){
            super();this.builder=new RoutePortBuilder(this);this.function=function;
    }
    public DoneableRoutePort(RoutePort item,io.fabric8.kubernetes.api.builder.Function<RoutePort,RoutePort> function){
            super(item);this.builder=new RoutePortBuilder(this, item);this.function=function;
    }
    public DoneableRoutePort(RoutePort item){
            super(item);this.builder=new RoutePortBuilder(this, item);this.function=new Function<RoutePort, RoutePort>() {
    public RoutePort apply(RoutePort item) {
        return item;
    }
}
;
    }

    public RoutePort done(){
             return function.apply(builder.build());
    }




}
