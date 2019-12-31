package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableGroupVersionResource extends GroupVersionResourceFluentImpl<DoneableGroupVersionResource> implements Doneable<GroupVersionResource>{

    private final GroupVersionResourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<GroupVersionResource,GroupVersionResource> function;

    public DoneableGroupVersionResource(io.fabric8.kubernetes.api.builder.Function<GroupVersionResource,GroupVersionResource> function){
            super();this.builder=new GroupVersionResourceBuilder(this);this.function=function;
    }
    public DoneableGroupVersionResource(GroupVersionResource item,io.fabric8.kubernetes.api.builder.Function<GroupVersionResource,GroupVersionResource> function){
            super(item);this.builder=new GroupVersionResourceBuilder(this, item);this.function=function;
    }
    public DoneableGroupVersionResource(GroupVersionResource item){
            super(item);this.builder=new GroupVersionResourceBuilder(this, item);this.function=new Function<GroupVersionResource, GroupVersionResource>() {
    public GroupVersionResource apply(GroupVersionResource item) {
        return item;
    }
}
;
    }

    public GroupVersionResource done(){
             return function.apply(builder.build());
    }




}
