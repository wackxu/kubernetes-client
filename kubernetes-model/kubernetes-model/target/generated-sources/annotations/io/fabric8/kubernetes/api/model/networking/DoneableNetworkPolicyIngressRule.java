package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableNetworkPolicyIngressRule extends NetworkPolicyIngressRuleFluentImpl<DoneableNetworkPolicyIngressRule> implements Doneable<NetworkPolicyIngressRule>{

    private final NetworkPolicyIngressRuleBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NetworkPolicyIngressRule,NetworkPolicyIngressRule> function;

    public DoneableNetworkPolicyIngressRule(io.fabric8.kubernetes.api.builder.Function<NetworkPolicyIngressRule,NetworkPolicyIngressRule> function){
            super();this.builder=new NetworkPolicyIngressRuleBuilder(this);this.function=function;
    }
    public DoneableNetworkPolicyIngressRule(NetworkPolicyIngressRule item,io.fabric8.kubernetes.api.builder.Function<NetworkPolicyIngressRule,NetworkPolicyIngressRule> function){
            super(item);this.builder=new NetworkPolicyIngressRuleBuilder(this, item);this.function=function;
    }
    public DoneableNetworkPolicyIngressRule(NetworkPolicyIngressRule item){
            super(item);this.builder=new NetworkPolicyIngressRuleBuilder(this, item);this.function=new Function<NetworkPolicyIngressRule, NetworkPolicyIngressRule>() {
    public NetworkPolicyIngressRule apply(NetworkPolicyIngressRule item) {
        return item;
    }
}
;
    }

    public NetworkPolicyIngressRule done(){
             return function.apply(builder.build());
    }




}
