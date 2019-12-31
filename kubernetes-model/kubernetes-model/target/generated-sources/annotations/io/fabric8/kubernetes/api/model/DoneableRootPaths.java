package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableRootPaths extends RootPathsFluentImpl<DoneableRootPaths> implements Doneable<RootPaths>{

    private final RootPathsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RootPaths,RootPaths> function;

    public DoneableRootPaths(io.fabric8.kubernetes.api.builder.Function<RootPaths,RootPaths> function){
            super();this.builder=new RootPathsBuilder(this);this.function=function;
    }
    public DoneableRootPaths(RootPaths item,io.fabric8.kubernetes.api.builder.Function<RootPaths,RootPaths> function){
            super(item);this.builder=new RootPathsBuilder(this, item);this.function=function;
    }
    public DoneableRootPaths(RootPaths item){
            super(item);this.builder=new RootPathsBuilder(this, item);this.function=new Function<RootPaths, RootPaths>() {
    public RootPaths apply(RootPaths item) {
        return item;
    }
}
;
    }

    public RootPaths done(){
             return function.apply(builder.build());
    }




}
