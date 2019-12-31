package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRouteList extends RouteListFluentImpl<DoneableRouteList> implements Doneable<RouteList>{

    private final RouteListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RouteList,RouteList> function;

    public DoneableRouteList(io.fabric8.kubernetes.api.builder.Function<RouteList,RouteList> function){
            super();this.builder=new RouteListBuilder(this);this.function=function;
    }
    public DoneableRouteList(RouteList item,io.fabric8.kubernetes.api.builder.Function<RouteList,RouteList> function){
            super(item);this.builder=new RouteListBuilder(this, item);this.function=function;
    }
    public DoneableRouteList(RouteList item){
            super(item);this.builder=new RouteListBuilder(this, item);this.function=new Function<RouteList, RouteList>() {
    public RouteList apply(RouteList item) {
        return item;
    }
}
;
    }

    public RouteList done(){
             return function.apply(builder.build());
    }




}
