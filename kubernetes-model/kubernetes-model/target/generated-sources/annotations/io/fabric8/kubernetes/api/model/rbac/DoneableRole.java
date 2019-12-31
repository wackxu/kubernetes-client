package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRole extends RoleFluentImpl<DoneableRole> implements Doneable<Role>{

    private final RoleBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Role,Role> function;

    public DoneableRole(io.fabric8.kubernetes.api.builder.Function<Role,Role> function){
            super();this.builder=new RoleBuilder(this);this.function=function;
    }
    public DoneableRole(Role item,io.fabric8.kubernetes.api.builder.Function<Role,Role> function){
            super(item);this.builder=new RoleBuilder(this, item);this.function=function;
    }
    public DoneableRole(Role item){
            super(item);this.builder=new RoleBuilder(this, item);this.function=new Function<Role, Role>() {
    public Role apply(Role item) {
        return item;
    }
}
;
    }

    public Role done(){
             return function.apply(builder.build());
    }




}
