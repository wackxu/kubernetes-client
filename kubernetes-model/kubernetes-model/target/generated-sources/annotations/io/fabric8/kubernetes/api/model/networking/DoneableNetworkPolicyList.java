package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableNetworkPolicyList extends NetworkPolicyListFluentImpl<DoneableNetworkPolicyList> implements Doneable<NetworkPolicyList>{

    private final NetworkPolicyListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NetworkPolicyList,NetworkPolicyList> function;

    public DoneableNetworkPolicyList(io.fabric8.kubernetes.api.builder.Function<NetworkPolicyList,NetworkPolicyList> function){
            super();this.builder=new NetworkPolicyListBuilder(this);this.function=function;
    }
    public DoneableNetworkPolicyList(NetworkPolicyList item,io.fabric8.kubernetes.api.builder.Function<NetworkPolicyList,NetworkPolicyList> function){
            super(item);this.builder=new NetworkPolicyListBuilder(this, item);this.function=function;
    }
    public DoneableNetworkPolicyList(NetworkPolicyList item){
            super(item);this.builder=new NetworkPolicyListBuilder(this, item);this.function=new Function<NetworkPolicyList, NetworkPolicyList>() {
    public NetworkPolicyList apply(NetworkPolicyList item) {
        return item;
    }
}
;
    }

    public NetworkPolicyList done(){
             return function.apply(builder.build());
    }




}
