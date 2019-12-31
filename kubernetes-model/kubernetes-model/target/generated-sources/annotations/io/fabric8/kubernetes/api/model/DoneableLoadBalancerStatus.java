package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableLoadBalancerStatus extends LoadBalancerStatusFluentImpl<DoneableLoadBalancerStatus> implements Doneable<LoadBalancerStatus>{

    private final LoadBalancerStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<LoadBalancerStatus,LoadBalancerStatus> function;

    public DoneableLoadBalancerStatus(io.fabric8.kubernetes.api.builder.Function<LoadBalancerStatus,LoadBalancerStatus> function){
            super();this.builder=new LoadBalancerStatusBuilder(this);this.function=function;
    }
    public DoneableLoadBalancerStatus(LoadBalancerStatus item,io.fabric8.kubernetes.api.builder.Function<LoadBalancerStatus,LoadBalancerStatus> function){
            super(item);this.builder=new LoadBalancerStatusBuilder(this, item);this.function=function;
    }
    public DoneableLoadBalancerStatus(LoadBalancerStatus item){
            super(item);this.builder=new LoadBalancerStatusBuilder(this, item);this.function=new Function<LoadBalancerStatus, LoadBalancerStatus>() {
    public LoadBalancerStatus apply(LoadBalancerStatus item) {
        return item;
    }
}
;
    }

    public LoadBalancerStatus done(){
             return function.apply(builder.build());
    }




}
