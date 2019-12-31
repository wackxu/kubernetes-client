package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableCluster extends ClusterFluentImpl<DoneableCluster> implements Doneable<Cluster>{

    private final ClusterBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Cluster,Cluster> function;

    public DoneableCluster(io.fabric8.kubernetes.api.builder.Function<Cluster,Cluster> function){
            super();this.builder=new ClusterBuilder(this);this.function=function;
    }
    public DoneableCluster(Cluster item,io.fabric8.kubernetes.api.builder.Function<Cluster,Cluster> function){
            super(item);this.builder=new ClusterBuilder(this, item);this.function=function;
    }
    public DoneableCluster(Cluster item){
            super(item);this.builder=new ClusterBuilder(this, item);this.function=new Function<Cluster, Cluster>() {
    public Cluster apply(Cluster item) {
        return item;
    }
}
;
    }

    public Cluster done(){
             return function.apply(builder.build());
    }




}
