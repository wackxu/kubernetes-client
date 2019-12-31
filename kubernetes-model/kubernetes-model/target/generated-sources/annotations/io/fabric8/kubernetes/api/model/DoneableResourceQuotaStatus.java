package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableResourceQuotaStatus extends ResourceQuotaStatusFluentImpl<DoneableResourceQuotaStatus> implements Doneable<ResourceQuotaStatus>{

    private final ResourceQuotaStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ResourceQuotaStatus,ResourceQuotaStatus> function;

    public DoneableResourceQuotaStatus(io.fabric8.kubernetes.api.builder.Function<ResourceQuotaStatus,ResourceQuotaStatus> function){
            super();this.builder=new ResourceQuotaStatusBuilder(this);this.function=function;
    }
    public DoneableResourceQuotaStatus(ResourceQuotaStatus item,io.fabric8.kubernetes.api.builder.Function<ResourceQuotaStatus,ResourceQuotaStatus> function){
            super(item);this.builder=new ResourceQuotaStatusBuilder(this, item);this.function=function;
    }
    public DoneableResourceQuotaStatus(ResourceQuotaStatus item){
            super(item);this.builder=new ResourceQuotaStatusBuilder(this, item);this.function=new Function<ResourceQuotaStatus, ResourceQuotaStatus>() {
    public ResourceQuotaStatus apply(ResourceQuotaStatus item) {
        return item;
    }
}
;
    }

    public ResourceQuotaStatus done(){
             return function.apply(builder.build());
    }




}
