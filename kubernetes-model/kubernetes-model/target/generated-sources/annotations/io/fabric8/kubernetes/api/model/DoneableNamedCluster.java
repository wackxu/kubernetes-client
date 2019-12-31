package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNamedCluster extends NamedClusterFluentImpl<DoneableNamedCluster> implements Doneable<NamedCluster>{

    private final NamedClusterBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NamedCluster,NamedCluster> function;

    public DoneableNamedCluster(io.fabric8.kubernetes.api.builder.Function<NamedCluster,NamedCluster> function){
            super();this.builder=new NamedClusterBuilder(this);this.function=function;
    }
    public DoneableNamedCluster(NamedCluster item,io.fabric8.kubernetes.api.builder.Function<NamedCluster,NamedCluster> function){
            super(item);this.builder=new NamedClusterBuilder(this, item);this.function=function;
    }
    public DoneableNamedCluster(NamedCluster item){
            super(item);this.builder=new NamedClusterBuilder(this, item);this.function=new Function<NamedCluster, NamedCluster>() {
    public NamedCluster apply(NamedCluster item) {
        return item;
    }
}
;
    }

    public NamedCluster done(){
             return function.apply(builder.build());
    }




}
