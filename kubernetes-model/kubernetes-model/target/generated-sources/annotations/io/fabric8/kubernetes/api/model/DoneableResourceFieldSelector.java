package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableResourceFieldSelector extends ResourceFieldSelectorFluentImpl<DoneableResourceFieldSelector> implements Doneable<ResourceFieldSelector>{

    private final ResourceFieldSelectorBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ResourceFieldSelector,ResourceFieldSelector> function;

    public DoneableResourceFieldSelector(io.fabric8.kubernetes.api.builder.Function<ResourceFieldSelector,ResourceFieldSelector> function){
            super();this.builder=new ResourceFieldSelectorBuilder(this);this.function=function;
    }
    public DoneableResourceFieldSelector(ResourceFieldSelector item,io.fabric8.kubernetes.api.builder.Function<ResourceFieldSelector,ResourceFieldSelector> function){
            super(item);this.builder=new ResourceFieldSelectorBuilder(this, item);this.function=function;
    }
    public DoneableResourceFieldSelector(ResourceFieldSelector item){
            super(item);this.builder=new ResourceFieldSelectorBuilder(this, item);this.function=new Function<ResourceFieldSelector, ResourceFieldSelector>() {
    public ResourceFieldSelector apply(ResourceFieldSelector item) {
        return item;
    }
}
;
    }

    public ResourceFieldSelector done(){
             return function.apply(builder.build());
    }




}
