package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableNetNamespaceList extends NetNamespaceListFluentImpl<DoneableNetNamespaceList> implements Doneable<NetNamespaceList>{

    private final NetNamespaceListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NetNamespaceList,NetNamespaceList> function;

    public DoneableNetNamespaceList(io.fabric8.kubernetes.api.builder.Function<NetNamespaceList,NetNamespaceList> function){
            super();this.builder=new NetNamespaceListBuilder(this);this.function=function;
    }
    public DoneableNetNamespaceList(NetNamespaceList item,io.fabric8.kubernetes.api.builder.Function<NetNamespaceList,NetNamespaceList> function){
            super(item);this.builder=new NetNamespaceListBuilder(this, item);this.function=function;
    }
    public DoneableNetNamespaceList(NetNamespaceList item){
            super(item);this.builder=new NetNamespaceListBuilder(this, item);this.function=new Function<NetNamespaceList, NetNamespaceList>() {
    public NetNamespaceList apply(NetNamespaceList item) {
        return item;
    }
}
;
    }

    public NetNamespaceList done(){
             return function.apply(builder.build());
    }




}
