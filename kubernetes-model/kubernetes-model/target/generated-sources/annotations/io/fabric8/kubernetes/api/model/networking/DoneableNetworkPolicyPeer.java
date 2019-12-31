package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableNetworkPolicyPeer extends NetworkPolicyPeerFluentImpl<DoneableNetworkPolicyPeer> implements Doneable<NetworkPolicyPeer>{

    private final NetworkPolicyPeerBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NetworkPolicyPeer,NetworkPolicyPeer> function;

    public DoneableNetworkPolicyPeer(io.fabric8.kubernetes.api.builder.Function<NetworkPolicyPeer,NetworkPolicyPeer> function){
            super();this.builder=new NetworkPolicyPeerBuilder(this);this.function=function;
    }
    public DoneableNetworkPolicyPeer(NetworkPolicyPeer item,io.fabric8.kubernetes.api.builder.Function<NetworkPolicyPeer,NetworkPolicyPeer> function){
            super(item);this.builder=new NetworkPolicyPeerBuilder(this, item);this.function=function;
    }
    public DoneableNetworkPolicyPeer(NetworkPolicyPeer item){
            super(item);this.builder=new NetworkPolicyPeerBuilder(this, item);this.function=new Function<NetworkPolicyPeer, NetworkPolicyPeer>() {
    public NetworkPolicyPeer apply(NetworkPolicyPeer item) {
        return item;
    }
}
;
    }

    public NetworkPolicyPeer done(){
             return function.apply(builder.build());
    }




}
