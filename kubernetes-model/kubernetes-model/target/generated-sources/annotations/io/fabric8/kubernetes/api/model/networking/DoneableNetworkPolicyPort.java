package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableNetworkPolicyPort extends NetworkPolicyPortFluentImpl<DoneableNetworkPolicyPort> implements Doneable<NetworkPolicyPort>{

    private final NetworkPolicyPortBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NetworkPolicyPort,NetworkPolicyPort> function;

    public DoneableNetworkPolicyPort(io.fabric8.kubernetes.api.builder.Function<NetworkPolicyPort,NetworkPolicyPort> function){
            super();this.builder=new NetworkPolicyPortBuilder(this);this.function=function;
    }
    public DoneableNetworkPolicyPort(NetworkPolicyPort item,io.fabric8.kubernetes.api.builder.Function<NetworkPolicyPort,NetworkPolicyPort> function){
            super(item);this.builder=new NetworkPolicyPortBuilder(this, item);this.function=function;
    }
    public DoneableNetworkPolicyPort(NetworkPolicyPort item){
            super(item);this.builder=new NetworkPolicyPortBuilder(this, item);this.function=new Function<NetworkPolicyPort, NetworkPolicyPort>() {
    public NetworkPolicyPort apply(NetworkPolicyPort item) {
        return item;
    }
}
;
    }

    public NetworkPolicyPort done(){
             return function.apply(builder.build());
    }




}
