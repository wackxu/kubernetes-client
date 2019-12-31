package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableNetNamespace extends NetNamespaceFluentImpl<DoneableNetNamespace> implements Doneable<NetNamespace>{

    private final NetNamespaceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NetNamespace,NetNamespace> function;

    public DoneableNetNamespace(io.fabric8.kubernetes.api.builder.Function<NetNamespace,NetNamespace> function){
            super();this.builder=new NetNamespaceBuilder(this);this.function=function;
    }
    public DoneableNetNamespace(NetNamespace item,io.fabric8.kubernetes.api.builder.Function<NetNamespace,NetNamespace> function){
            super(item);this.builder=new NetNamespaceBuilder(this, item);this.function=function;
    }
    public DoneableNetNamespace(NetNamespace item){
            super(item);this.builder=new NetNamespaceBuilder(this, item);this.function=new Function<NetNamespace, NetNamespace>() {
    public NetNamespace apply(NetNamespace item) {
        return item;
    }
}
;
    }

    public NetNamespace done(){
             return function.apply(builder.build());
    }




}
