package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRouteIngressCondition extends RouteIngressConditionFluentImpl<DoneableRouteIngressCondition> implements Doneable<RouteIngressCondition>{

    private final RouteIngressConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RouteIngressCondition,RouteIngressCondition> function;

    public DoneableRouteIngressCondition(io.fabric8.kubernetes.api.builder.Function<RouteIngressCondition,RouteIngressCondition> function){
            super();this.builder=new RouteIngressConditionBuilder(this);this.function=function;
    }
    public DoneableRouteIngressCondition(RouteIngressCondition item,io.fabric8.kubernetes.api.builder.Function<RouteIngressCondition,RouteIngressCondition> function){
            super(item);this.builder=new RouteIngressConditionBuilder(this, item);this.function=function;
    }
    public DoneableRouteIngressCondition(RouteIngressCondition item){
            super(item);this.builder=new RouteIngressConditionBuilder(this, item);this.function=new Function<RouteIngressCondition, RouteIngressCondition>() {
    public RouteIngressCondition apply(RouteIngressCondition item) {
        return item;
    }
}
;
    }

    public RouteIngressCondition done(){
             return function.apply(builder.build());
    }




}
