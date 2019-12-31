package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableGroupVersionKind extends GroupVersionKindFluentImpl<DoneableGroupVersionKind> implements Doneable<GroupVersionKind>{

    private final GroupVersionKindBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<GroupVersionKind,GroupVersionKind> function;

    public DoneableGroupVersionKind(io.fabric8.kubernetes.api.builder.Function<GroupVersionKind,GroupVersionKind> function){
            super();this.builder=new GroupVersionKindBuilder(this);this.function=function;
    }
    public DoneableGroupVersionKind(GroupVersionKind item,io.fabric8.kubernetes.api.builder.Function<GroupVersionKind,GroupVersionKind> function){
            super(item);this.builder=new GroupVersionKindBuilder(this, item);this.function=function;
    }
    public DoneableGroupVersionKind(GroupVersionKind item){
            super(item);this.builder=new GroupVersionKindBuilder(this, item);this.function=new Function<GroupVersionKind, GroupVersionKind>() {
    public GroupVersionKind apply(GroupVersionKind item) {
        return item;
    }
}
;
    }

    public GroupVersionKind done(){
             return function.apply(builder.build());
    }




}
