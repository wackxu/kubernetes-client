package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableNetworkPolicySpec extends NetworkPolicySpecFluentImpl<DoneableNetworkPolicySpec> implements Doneable<NetworkPolicySpec>{

    private final NetworkPolicySpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NetworkPolicySpec,NetworkPolicySpec> function;

    public DoneableNetworkPolicySpec(io.fabric8.kubernetes.api.builder.Function<NetworkPolicySpec,NetworkPolicySpec> function){
            super();this.builder=new NetworkPolicySpecBuilder(this);this.function=function;
    }
    public DoneableNetworkPolicySpec(NetworkPolicySpec item,io.fabric8.kubernetes.api.builder.Function<NetworkPolicySpec,NetworkPolicySpec> function){
            super(item);this.builder=new NetworkPolicySpecBuilder(this, item);this.function=function;
    }
    public DoneableNetworkPolicySpec(NetworkPolicySpec item){
            super(item);this.builder=new NetworkPolicySpecBuilder(this, item);this.function=new Function<NetworkPolicySpec, NetworkPolicySpec>() {
    public NetworkPolicySpec apply(NetworkPolicySpec item) {
        return item;
    }
}
;
    }

    public NetworkPolicySpec done(){
             return function.apply(builder.build());
    }




}
