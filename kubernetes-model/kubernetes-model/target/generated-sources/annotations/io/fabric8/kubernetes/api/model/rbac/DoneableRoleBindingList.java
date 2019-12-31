package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRoleBindingList extends RoleBindingListFluentImpl<DoneableRoleBindingList> implements Doneable<RoleBindingList>{

    private final RoleBindingListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RoleBindingList,RoleBindingList> function;

    public DoneableRoleBindingList(io.fabric8.kubernetes.api.builder.Function<RoleBindingList,RoleBindingList> function){
            super();this.builder=new RoleBindingListBuilder(this);this.function=function;
    }
    public DoneableRoleBindingList(RoleBindingList item,io.fabric8.kubernetes.api.builder.Function<RoleBindingList,RoleBindingList> function){
            super(item);this.builder=new RoleBindingListBuilder(this, item);this.function=function;
    }
    public DoneableRoleBindingList(RoleBindingList item){
            super(item);this.builder=new RoleBindingListBuilder(this, item);this.function=new Function<RoleBindingList, RoleBindingList>() {
    public RoleBindingList apply(RoleBindingList item) {
        return item;
    }
}
;
    }

    public RoleBindingList done(){
             return function.apply(builder.build());
    }




}
