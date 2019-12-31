package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRouteSpec extends RouteSpecFluentImpl<DoneableRouteSpec> implements Doneable<RouteSpec>{

    private final RouteSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RouteSpec,RouteSpec> function;

    public DoneableRouteSpec(io.fabric8.kubernetes.api.builder.Function<RouteSpec,RouteSpec> function){
            super();this.builder=new RouteSpecBuilder(this);this.function=function;
    }
    public DoneableRouteSpec(RouteSpec item,io.fabric8.kubernetes.api.builder.Function<RouteSpec,RouteSpec> function){
            super(item);this.builder=new RouteSpecBuilder(this, item);this.function=function;
    }
    public DoneableRouteSpec(RouteSpec item){
            super(item);this.builder=new RouteSpecBuilder(this, item);this.function=new Function<RouteSpec, RouteSpec>() {
    public RouteSpec apply(RouteSpec item) {
        return item;
    }
}
;
    }

    public RouteSpec done(){
             return function.apply(builder.build());
    }




}
