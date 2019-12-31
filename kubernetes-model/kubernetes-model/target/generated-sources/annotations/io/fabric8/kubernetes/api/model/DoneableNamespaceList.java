package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNamespaceList extends NamespaceListFluentImpl<DoneableNamespaceList> implements Doneable<NamespaceList>{

    private final NamespaceListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NamespaceList,NamespaceList> function;

    public DoneableNamespaceList(io.fabric8.kubernetes.api.builder.Function<NamespaceList,NamespaceList> function){
            super();this.builder=new NamespaceListBuilder(this);this.function=function;
    }
    public DoneableNamespaceList(NamespaceList item,io.fabric8.kubernetes.api.builder.Function<NamespaceList,NamespaceList> function){
            super(item);this.builder=new NamespaceListBuilder(this, item);this.function=function;
    }
    public DoneableNamespaceList(NamespaceList item){
            super(item);this.builder=new NamespaceListBuilder(this, item);this.function=new Function<NamespaceList, NamespaceList>() {
    public NamespaceList apply(NamespaceList item) {
        return item;
    }
}
;
    }

    public NamespaceList done(){
             return function.apply(builder.build());
    }




}
