package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableResourceQuotaList extends ResourceQuotaListFluentImpl<DoneableResourceQuotaList> implements Doneable<ResourceQuotaList>{

    private final ResourceQuotaListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ResourceQuotaList,ResourceQuotaList> function;

    public DoneableResourceQuotaList(io.fabric8.kubernetes.api.builder.Function<ResourceQuotaList,ResourceQuotaList> function){
            super();this.builder=new ResourceQuotaListBuilder(this);this.function=function;
    }
    public DoneableResourceQuotaList(ResourceQuotaList item,io.fabric8.kubernetes.api.builder.Function<ResourceQuotaList,ResourceQuotaList> function){
            super(item);this.builder=new ResourceQuotaListBuilder(this, item);this.function=function;
    }
    public DoneableResourceQuotaList(ResourceQuotaList item){
            super(item);this.builder=new ResourceQuotaListBuilder(this, item);this.function=new Function<ResourceQuotaList, ResourceQuotaList>() {
    public ResourceQuotaList apply(ResourceQuotaList item) {
        return item;
    }
}
;
    }

    public ResourceQuotaList done(){
             return function.apply(builder.build());
    }




}
