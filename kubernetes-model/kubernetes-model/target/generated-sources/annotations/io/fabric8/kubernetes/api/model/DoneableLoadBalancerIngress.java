package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableLoadBalancerIngress extends LoadBalancerIngressFluentImpl<DoneableLoadBalancerIngress> implements Doneable<LoadBalancerIngress>{

    private final LoadBalancerIngressBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<LoadBalancerIngress,LoadBalancerIngress> function;

    public DoneableLoadBalancerIngress(io.fabric8.kubernetes.api.builder.Function<LoadBalancerIngress,LoadBalancerIngress> function){
            super();this.builder=new LoadBalancerIngressBuilder(this);this.function=function;
    }
    public DoneableLoadBalancerIngress(LoadBalancerIngress item,io.fabric8.kubernetes.api.builder.Function<LoadBalancerIngress,LoadBalancerIngress> function){
            super(item);this.builder=new LoadBalancerIngressBuilder(this, item);this.function=function;
    }
    public DoneableLoadBalancerIngress(LoadBalancerIngress item){
            super(item);this.builder=new LoadBalancerIngressBuilder(this, item);this.function=new Function<LoadBalancerIngress, LoadBalancerIngress>() {
    public LoadBalancerIngress apply(LoadBalancerIngress item) {
        return item;
    }
}
;
    }

    public LoadBalancerIngress done(){
             return function.apply(builder.build());
    }




}
