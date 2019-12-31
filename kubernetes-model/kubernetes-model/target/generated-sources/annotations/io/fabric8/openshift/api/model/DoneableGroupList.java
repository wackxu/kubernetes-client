package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableGroupList extends GroupListFluentImpl<DoneableGroupList> implements Doneable<GroupList>{

    private final GroupListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<GroupList,GroupList> function;

    public DoneableGroupList(io.fabric8.kubernetes.api.builder.Function<GroupList,GroupList> function){
            super();this.builder=new GroupListBuilder(this);this.function=function;
    }
    public DoneableGroupList(GroupList item,io.fabric8.kubernetes.api.builder.Function<GroupList,GroupList> function){
            super(item);this.builder=new GroupListBuilder(this, item);this.function=function;
    }
    public DoneableGroupList(GroupList item){
            super(item);this.builder=new GroupListBuilder(this, item);this.function=new Function<GroupList, GroupList>() {
    public GroupList apply(GroupList item) {
        return item;
    }
}
;
    }

    public GroupList done(){
             return function.apply(builder.build());
    }




}
