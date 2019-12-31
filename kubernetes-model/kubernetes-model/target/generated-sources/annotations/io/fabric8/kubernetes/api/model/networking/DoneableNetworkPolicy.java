package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableNetworkPolicy extends NetworkPolicyFluentImpl<DoneableNetworkPolicy> implements Doneable<NetworkPolicy>{

    private final NetworkPolicyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NetworkPolicy,NetworkPolicy> function;

    public DoneableNetworkPolicy(io.fabric8.kubernetes.api.builder.Function<NetworkPolicy,NetworkPolicy> function){
            super();this.builder=new NetworkPolicyBuilder(this);this.function=function;
    }
    public DoneableNetworkPolicy(NetworkPolicy item,io.fabric8.kubernetes.api.builder.Function<NetworkPolicy,NetworkPolicy> function){
            super(item);this.builder=new NetworkPolicyBuilder(this, item);this.function=function;
    }
    public DoneableNetworkPolicy(NetworkPolicy item){
            super(item);this.builder=new NetworkPolicyBuilder(this, item);this.function=new Function<NetworkPolicy, NetworkPolicy>() {
    public NetworkPolicy apply(NetworkPolicy item) {
        return item;
    }
}
;
    }

    public NetworkPolicy done(){
             return function.apply(builder.build());
    }




}
