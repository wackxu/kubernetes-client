package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRouteIngress extends RouteIngressFluentImpl<DoneableRouteIngress> implements Doneable<RouteIngress>{

    private final RouteIngressBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RouteIngress,RouteIngress> function;

    public DoneableRouteIngress(io.fabric8.kubernetes.api.builder.Function<RouteIngress,RouteIngress> function){
            super();this.builder=new RouteIngressBuilder(this);this.function=function;
    }
    public DoneableRouteIngress(RouteIngress item,io.fabric8.kubernetes.api.builder.Function<RouteIngress,RouteIngress> function){
            super(item);this.builder=new RouteIngressBuilder(this, item);this.function=function;
    }
    public DoneableRouteIngress(RouteIngress item){
            super(item);this.builder=new RouteIngressBuilder(this, item);this.function=new Function<RouteIngress, RouteIngress>() {
    public RouteIngress apply(RouteIngress item) {
        return item;
    }
}
;
    }

    public RouteIngress done(){
             return function.apply(builder.build());
    }




}
