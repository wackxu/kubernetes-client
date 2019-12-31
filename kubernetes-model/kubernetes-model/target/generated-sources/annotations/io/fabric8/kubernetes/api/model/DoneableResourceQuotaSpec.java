package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableResourceQuotaSpec extends ResourceQuotaSpecFluentImpl<DoneableResourceQuotaSpec> implements Doneable<ResourceQuotaSpec>{

    private final ResourceQuotaSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ResourceQuotaSpec,ResourceQuotaSpec> function;

    public DoneableResourceQuotaSpec(io.fabric8.kubernetes.api.builder.Function<ResourceQuotaSpec,ResourceQuotaSpec> function){
            super();this.builder=new ResourceQuotaSpecBuilder(this);this.function=function;
    }
    public DoneableResourceQuotaSpec(ResourceQuotaSpec item,io.fabric8.kubernetes.api.builder.Function<ResourceQuotaSpec,ResourceQuotaSpec> function){
            super(item);this.builder=new ResourceQuotaSpecBuilder(this, item);this.function=function;
    }
    public DoneableResourceQuotaSpec(ResourceQuotaSpec item){
            super(item);this.builder=new ResourceQuotaSpecBuilder(this, item);this.function=new Function<ResourceQuotaSpec, ResourceQuotaSpec>() {
    public ResourceQuotaSpec apply(ResourceQuotaSpec item) {
        return item;
    }
}
;
    }

    public ResourceQuotaSpec done(){
             return function.apply(builder.build());
    }




}
