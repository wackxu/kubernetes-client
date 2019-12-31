package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRouteTargetReference extends RouteTargetReferenceFluentImpl<DoneableRouteTargetReference> implements Doneable<RouteTargetReference>{

    private final RouteTargetReferenceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RouteTargetReference,RouteTargetReference> function;

    public DoneableRouteTargetReference(io.fabric8.kubernetes.api.builder.Function<RouteTargetReference,RouteTargetReference> function){
            super();this.builder=new RouteTargetReferenceBuilder(this);this.function=function;
    }
    public DoneableRouteTargetReference(RouteTargetReference item,io.fabric8.kubernetes.api.builder.Function<RouteTargetReference,RouteTargetReference> function){
            super(item);this.builder=new RouteTargetReferenceBuilder(this, item);this.function=function;
    }
    public DoneableRouteTargetReference(RouteTargetReference item){
            super(item);this.builder=new RouteTargetReferenceBuilder(this, item);this.function=new Function<RouteTargetReference, RouteTargetReference>() {
    public RouteTargetReference apply(RouteTargetReference item) {
        return item;
    }
}
;
    }

    public RouteTargetReference done(){
             return function.apply(builder.build());
    }




}
