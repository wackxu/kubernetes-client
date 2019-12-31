package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableResourceQuota extends ResourceQuotaFluentImpl<DoneableResourceQuota> implements Doneable<ResourceQuota>{

    private final ResourceQuotaBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ResourceQuota,ResourceQuota> function;

    public DoneableResourceQuota(io.fabric8.kubernetes.api.builder.Function<ResourceQuota,ResourceQuota> function){
            super();this.builder=new ResourceQuotaBuilder(this);this.function=function;
    }
    public DoneableResourceQuota(ResourceQuota item,io.fabric8.kubernetes.api.builder.Function<ResourceQuota,ResourceQuota> function){
            super(item);this.builder=new ResourceQuotaBuilder(this, item);this.function=function;
    }
    public DoneableResourceQuota(ResourceQuota item){
            super(item);this.builder=new ResourceQuotaBuilder(this, item);this.function=new Function<ResourceQuota, ResourceQuota>() {
    public ResourceQuota apply(ResourceQuota item) {
        return item;
    }
}
;
    }

    public ResourceQuota done(){
             return function.apply(builder.build());
    }




}
