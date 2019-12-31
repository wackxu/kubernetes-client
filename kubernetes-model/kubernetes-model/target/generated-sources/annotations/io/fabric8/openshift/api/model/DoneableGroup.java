package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableGroup extends GroupFluentImpl<DoneableGroup> implements Doneable<Group>{

    private final GroupBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Group,Group> function;

    public DoneableGroup(io.fabric8.kubernetes.api.builder.Function<Group,Group> function){
            super();this.builder=new GroupBuilder(this);this.function=function;
    }
    public DoneableGroup(Group item,io.fabric8.kubernetes.api.builder.Function<Group,Group> function){
            super(item);this.builder=new GroupBuilder(this, item);this.function=function;
    }
    public DoneableGroup(Group item){
            super(item);this.builder=new GroupBuilder(this, item);this.function=new Function<Group, Group>() {
    public Group apply(Group item) {
        return item;
    }
}
;
    }

    public Group done(){
             return function.apply(builder.build());
    }




}
