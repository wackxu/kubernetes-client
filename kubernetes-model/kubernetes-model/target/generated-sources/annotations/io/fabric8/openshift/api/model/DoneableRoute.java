package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRoute extends RouteFluentImpl<DoneableRoute> implements Doneable<Route>{

    private final RouteBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Route,Route> function;

    public DoneableRoute(io.fabric8.kubernetes.api.builder.Function<Route,Route> function){
            super();this.builder=new RouteBuilder(this);this.function=function;
    }
    public DoneableRoute(Route item,io.fabric8.kubernetes.api.builder.Function<Route,Route> function){
            super(item);this.builder=new RouteBuilder(this, item);this.function=function;
    }
    public DoneableRoute(Route item){
            super(item);this.builder=new RouteBuilder(this, item);this.function=new Function<Route, Route>() {
    public Route apply(Route item) {
        return item;
    }
}
;
    }

    public Route done(){
             return function.apply(builder.build());
    }




}
