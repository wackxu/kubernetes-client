package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableListMeta extends ListMetaFluentImpl<DoneableListMeta> implements Doneable<ListMeta>{

    private final ListMetaBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ListMeta,ListMeta> function;

    public DoneableListMeta(io.fabric8.kubernetes.api.builder.Function<ListMeta,ListMeta> function){
            super();this.builder=new ListMetaBuilder(this);this.function=function;
    }
    public DoneableListMeta(ListMeta item,io.fabric8.kubernetes.api.builder.Function<ListMeta,ListMeta> function){
            super(item);this.builder=new ListMetaBuilder(this, item);this.function=function;
    }
    public DoneableListMeta(ListMeta item){
            super(item);this.builder=new ListMetaBuilder(this, item);this.function=new Function<ListMeta, ListMeta>() {
    public ListMeta apply(ListMeta item) {
        return item;
    }
}
;
    }

    public ListMeta done(){
             return function.apply(builder.build());
    }




}
