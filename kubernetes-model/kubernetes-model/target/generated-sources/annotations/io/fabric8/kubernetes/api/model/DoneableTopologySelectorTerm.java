package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableTopologySelectorTerm extends TopologySelectorTermFluentImpl<DoneableTopologySelectorTerm> implements Doneable<TopologySelectorTerm>{

    private final TopologySelectorTermBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TopologySelectorTerm,TopologySelectorTerm> function;

    public DoneableTopologySelectorTerm(io.fabric8.kubernetes.api.builder.Function<TopologySelectorTerm,TopologySelectorTerm> function){
            super();this.builder=new TopologySelectorTermBuilder(this);this.function=function;
    }
    public DoneableTopologySelectorTerm(TopologySelectorTerm item,io.fabric8.kubernetes.api.builder.Function<TopologySelectorTerm,TopologySelectorTerm> function){
            super(item);this.builder=new TopologySelectorTermBuilder(this, item);this.function=function;
    }
    public DoneableTopologySelectorTerm(TopologySelectorTerm item){
            super(item);this.builder=new TopologySelectorTermBuilder(this, item);this.function=new Function<TopologySelectorTerm, TopologySelectorTerm>() {
    public TopologySelectorTerm apply(TopologySelectorTerm item) {
        return item;
    }
}
;
    }

    public TopologySelectorTerm done(){
             return function.apply(builder.build());
    }




}
