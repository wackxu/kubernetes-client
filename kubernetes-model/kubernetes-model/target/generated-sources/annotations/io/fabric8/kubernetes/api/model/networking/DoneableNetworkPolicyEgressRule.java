package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableNetworkPolicyEgressRule extends NetworkPolicyEgressRuleFluentImpl<DoneableNetworkPolicyEgressRule> implements Doneable<NetworkPolicyEgressRule>{

    private final NetworkPolicyEgressRuleBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NetworkPolicyEgressRule,NetworkPolicyEgressRule> function;

    public DoneableNetworkPolicyEgressRule(io.fabric8.kubernetes.api.builder.Function<NetworkPolicyEgressRule,NetworkPolicyEgressRule> function){
            super();this.builder=new NetworkPolicyEgressRuleBuilder(this);this.function=function;
    }
    public DoneableNetworkPolicyEgressRule(NetworkPolicyEgressRule item,io.fabric8.kubernetes.api.builder.Function<NetworkPolicyEgressRule,NetworkPolicyEgressRule> function){
            super(item);this.builder=new NetworkPolicyEgressRuleBuilder(this, item);this.function=function;
    }
    public DoneableNetworkPolicyEgressRule(NetworkPolicyEgressRule item){
            super(item);this.builder=new NetworkPolicyEgressRuleBuilder(this, item);this.function=new Function<NetworkPolicyEgressRule, NetworkPolicyEgressRule>() {
    public NetworkPolicyEgressRule apply(NetworkPolicyEgressRule item) {
        return item;
    }
}
;
    }

    public NetworkPolicyEgressRule done(){
             return function.apply(builder.build());
    }




}
