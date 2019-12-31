package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRoleRef extends RoleRefFluentImpl<DoneableRoleRef> implements Doneable<RoleRef>{

    private final RoleRefBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RoleRef,RoleRef> function;

    public DoneableRoleRef(io.fabric8.kubernetes.api.builder.Function<RoleRef,RoleRef> function){
            super();this.builder=new RoleRefBuilder(this);this.function=function;
    }
    public DoneableRoleRef(RoleRef item,io.fabric8.kubernetes.api.builder.Function<RoleRef,RoleRef> function){
            super(item);this.builder=new RoleRefBuilder(this, item);this.function=function;
    }
    public DoneableRoleRef(RoleRef item){
            super(item);this.builder=new RoleRefBuilder(this, item);this.function=new Function<RoleRef, RoleRef>() {
    public RoleRef apply(RoleRef item) {
        return item;
    }
}
;
    }

    public RoleRef done(){
             return function.apply(builder.build());
    }




}
