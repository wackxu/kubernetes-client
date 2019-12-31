package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRoleList extends RoleListFluentImpl<DoneableRoleList> implements Doneable<RoleList>{

    private final RoleListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RoleList,RoleList> function;

    public DoneableRoleList(io.fabric8.kubernetes.api.builder.Function<RoleList,RoleList> function){
            super();this.builder=new RoleListBuilder(this);this.function=function;
    }
    public DoneableRoleList(RoleList item,io.fabric8.kubernetes.api.builder.Function<RoleList,RoleList> function){
            super(item);this.builder=new RoleListBuilder(this, item);this.function=function;
    }
    public DoneableRoleList(RoleList item){
            super(item);this.builder=new RoleListBuilder(this, item);this.function=new Function<RoleList, RoleList>() {
    public RoleList apply(RoleList item) {
        return item;
    }
}
;
    }

    public RoleList done(){
             return function.apply(builder.build());
    }




}
