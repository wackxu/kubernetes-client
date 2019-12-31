package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNamespaceStatus extends NamespaceStatusFluentImpl<DoneableNamespaceStatus> implements Doneable<NamespaceStatus>{

    private final NamespaceStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NamespaceStatus,NamespaceStatus> function;

    public DoneableNamespaceStatus(io.fabric8.kubernetes.api.builder.Function<NamespaceStatus,NamespaceStatus> function){
            super();this.builder=new NamespaceStatusBuilder(this);this.function=function;
    }
    public DoneableNamespaceStatus(NamespaceStatus item,io.fabric8.kubernetes.api.builder.Function<NamespaceStatus,NamespaceStatus> function){
            super(item);this.builder=new NamespaceStatusBuilder(this, item);this.function=function;
    }
    public DoneableNamespaceStatus(NamespaceStatus item){
            super(item);this.builder=new NamespaceStatusBuilder(this, item);this.function=new Function<NamespaceStatus, NamespaceStatus>() {
    public NamespaceStatus apply(NamespaceStatus item) {
        return item;
    }
}
;
    }

    public NamespaceStatus done(){
             return function.apply(builder.build());
    }




}
