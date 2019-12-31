package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRouteStatus extends RouteStatusFluentImpl<DoneableRouteStatus> implements Doneable<RouteStatus>{

    private final RouteStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RouteStatus,RouteStatus> function;

    public DoneableRouteStatus(io.fabric8.kubernetes.api.builder.Function<RouteStatus,RouteStatus> function){
            super();this.builder=new RouteStatusBuilder(this);this.function=function;
    }
    public DoneableRouteStatus(RouteStatus item,io.fabric8.kubernetes.api.builder.Function<RouteStatus,RouteStatus> function){
            super(item);this.builder=new RouteStatusBuilder(this, item);this.function=function;
    }
    public DoneableRouteStatus(RouteStatus item){
            super(item);this.builder=new RouteStatusBuilder(this, item);this.function=new Function<RouteStatus, RouteStatus>() {
    public RouteStatus apply(RouteStatus item) {
        return item;
    }
}
;
    }

    public RouteStatus done(){
             return function.apply(builder.build());
    }




}
